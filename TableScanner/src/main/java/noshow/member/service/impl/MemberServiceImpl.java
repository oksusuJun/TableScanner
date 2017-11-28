package noshow.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import noshow.member.dao.MemberDAO;
import noshow.member.service.MemberService;
import noshow.vo.Member;

@Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO dao;
	
	@Override
	public int addMember(Member member) {
		return dao.insertMember(member);
	}
	@Override
	public int deleteMember(String id) {
		return dao.deleteMemberById(id);
	}
	@Override
	public int updateMember(Member member) {
		return dao.updateMemberById(member);
	}
	@Override
	public Member selectMemberById(String id) {
		return dao.selectMemberById(id);
	}
	
}
