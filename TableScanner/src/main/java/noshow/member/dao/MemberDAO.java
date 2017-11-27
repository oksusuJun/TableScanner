package noshow.member.dao;

import org.apache.ibatis.session.SqlSession;

import noshow.vo.Member;

public interface MemberDAO {

	//member DB저장
	int insertMember(SqlSession session, Member member);
	
	//member DB수정
	int updateMemberById(SqlSession session, Member member);
	
	//member DB삭제
	int deleteMemberById(SqlSession session, String email);
	
	//member ID으로 조회
	Member selectMemberById(SqlSession session, String email);
	
}
