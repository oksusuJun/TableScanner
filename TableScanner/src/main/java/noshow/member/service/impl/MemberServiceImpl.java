package noshow.member.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import noshow.member.dao.MemberDAO;
import noshow.member.service.MemberService;
import noshow.vo.Authority;
import noshow.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO dao;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	@Override
	@Transactional
	public void addMember(Member member, String role) {
//		member.setMemberPassword(passwordEncoder.encode(member.getMemberPassword()));
		dao.insertMember(member);
		dao.insertAuthority(new Authority(member.getMemberId(), role));
		if(role.equals("ROLE_ADMIN")) {
			dao.insertAuthority(new Authority(member.getMemberId(), "ROLE_MEMBER"));
		}
	}

	@Override
	public Member getUserByMemberId(String MemberId) {
		return dao.selectMemberByMemberId(MemberId);
	}

	@Override
	public void updateUserProfile(Member member) {
//		member.setMemberPassword(passwordEncoder.encode(member.getMemberPassword()));
		dao.updateMemberByMemberId(member);
		System.out.println(member);
	}
	

	
}
