package noshow.member.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import noshow.member.dao.MemberDAO;
import noshow.member.service.MemberService;
import noshow.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Resource
	private MemberDAO dao;
	
	@Override
	public int getUserByUserId(Member member) {
		return dao.insertMember(member);
	}
	
	
}
