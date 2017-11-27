package noshow.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import noshow.vo.Member;

public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String makeSqlId(String id) {
		return "noshow.config.mybatis.mapper.memberMapper." + id;
	}
	
	@Override
	public int insertMember(SqlSession session, Member member) {
		return session.insert(makeSqlId("insertMember"), member);
	}
	
	@Override
	public int updateMemberById(SqlSession session, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteMemberById(SqlSession session, String email) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Member selectMemberById(SqlSession session, String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
