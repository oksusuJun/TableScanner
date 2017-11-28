package noshow.security.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;



import noshow.member.dao.MemberDAO;
import noshow.vo.Authority;
import noshow.vo.Member;


/*
 * Spring Security 컨테이너가 사용자 인증 처리(로그인 처리) 할때 호출할 클래스
 * 			=> AuthenticationProvider
 * 구현 : AuthenticationProvider 를 implements. 메소드 오버라이딩(authenticate())
 */
@Component
public class UserAuthenticationProvider implements AuthenticationProvider{
	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private PasswordEncoder encoder;
	//문자열을 암호화 - encode()
	//문자열과 암호화된 문자열을 비고 - matches(비교대상문자열, 암호화된문자열) : boolean
	
	/*
	 	- Authentication : 인증/권한 정보를 가지는 객체 
			- 매개변수는 로그인 처리시 사용할 ID와 패스워드를 제공
			- 리턴 타입은 로그인처리 끝나고 로그인한 사용자의 정보를 담아 리턴할때 사용
			- UsernamePasswordAuthenticationToken : Autentication의 구현클래스로 id와 패스워드로 인증하는 경우 사용
		- 인증 실패 : Exception을 던지거나 return null 인 경우 스프링 시큐리티 컨테이너는 인증실패로처리
	  GrantedAuthority - 권한정보 하나를 저장하는 객체. 권한이 여러개일 경우 List에 담는다.
	*/
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("안녕하세요");
		//ID 체크
		String id = authentication.getName();//사용자가 입력한 ID
		Member member = dao.selectMemberByMemberId(id);
		if(member == null){ //없는 id => 로그인실패
			throw new UsernameNotFoundException("ID를 확인하세요");
		}
		//패스워드 체크
		String password = (String)authentication.getCredentials();//사용자가 입력한 패스워드.
		if(!encoder.matches(password, member.getMemberPassword())){//틀린 패스워드
			throw new BadCredentialsException("패스워드를 확인하세요");
		}
		//인증 성공
		//권한 조회
		List<Authority> list = dao.selectAuthorityByMemberId(id);
		
		//SimpleGrantedAuthority - 권한정보를 문자열로 저장.
		List<SimpleGrantedAuthority> authList = new ArrayList<>();
		for(Authority au : list){
			authList.add(new SimpleGrantedAuthority(au.getAuthority()));
		}
		
		//인증한 사용자 정보(Principal), 패스워드, 인증된사용자의 권한들 을 넣어 Authentication객체 생성해 리턴
		return new UsernamePasswordAuthenticationToken(member, null, authList);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
	}

	
}


