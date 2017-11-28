package noshow.member.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import noshow.member.dao.MemberDAO;
import noshow.vo.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSessionTemplate session;
	
	private String makeSqlId(String id) {
		return "noshow.config.mybatis.mapper.memberMapper." + id;
	}
	
	@Override
	public int insertMember(Member member) {
		return session.insert(makeSqlId("insertMember"), member);
	}
	
	@Override
	public int updateMemberById(Member member) {
		return session.update(makeSqlId("updateMemberById"), member);
	}
	
	@Override
	public int deleteMemberById(String id) {
		return session.delete(makeSqlId("deleteMemberById"), id);
	}
	
	@Override
	public Member selectMemberById(String id) {
		return session.selectOne(makeSqlId("selectMemberById"), id);
	}
	
}
