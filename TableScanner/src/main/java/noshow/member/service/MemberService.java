package noshow.member.service;

import noshow.vo.Member;

public interface MemberService {
	

	int addMember(Member member);

	int deleteMember(String id);

	int updateMember(Member member);

	Member selectMemberById(String id);
}
