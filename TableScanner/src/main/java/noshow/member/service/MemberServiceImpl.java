package noshow.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import noshow.member.dao.MemberDAO;
import noshow.vo.Member;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO dao;
	
	@Override
	public int getUserByUserId(Member member) {
		return dao.insertMember(member);
	}
	
	
}
