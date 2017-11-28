package noshow.member.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import noshow.member.dao.OwnerMemberDAO;
import noshow.vo.Restaurant;

@Repository
public class OwnerMemberDAOImpl implements OwnerMemberDAO{
   
   @Autowired
   private SqlSessionTemplate session;
   
   private String makeSqlId(String id) {
      return "noshow.config.mybatis.mapper.ownerMemberMapper." + id;
   }

   @Override
   public int insertRestaurant(Restaurant rt) {
      return session.insert(makeSqlId("insertRestaurant"), rt);
   }

	   @Override
	public int updateRestaurant(Restaurant rt) {
		return session.update(makeSqlId("updateRestaurant"), rt);
	}
	
	@Override
	public int deleteRestaurant(String businessId) {
		return session.delete(makeSqlId("deleteRestaurant"), businessId);
	}

	@Override
	public List<Restaurant> selectRestaurantByBusinessId(String businessId) {
		return session.selectList(makeSqlId("selectRestaurantByBusinessId"), businessId);
	}	

}