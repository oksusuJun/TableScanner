package noshow.member.dao;

import noshow.vo.Member;

public interface MemberDAO {

	//member DB저장
	int insertMember(Member member);
	
	//member DB수정
	int updateMemberById(Member member);
	
	//member DB삭제
	int deleteMemberById(String id);
	
	//member ID으로 조회
	Member selectMemberById(String id);
	
}
