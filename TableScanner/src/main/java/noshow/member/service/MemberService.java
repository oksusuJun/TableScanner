package noshow.member.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.vo.Member;

public interface MemberService {
	

	int addMember(Member member);

	int deleteMember(String id);

	int updateMember(Member member);

	Member selectMemberById(String id);
}
