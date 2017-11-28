package noshow.member.dao.impl;

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
   public int updateRestaurantById(Restaurant rt) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int deleteRestaurantByNum(int businessNum) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public Restaurant selectMemberByNum(int businessNum) {
      // TODO Auto-generated method stub
      return null;
   }
   
}