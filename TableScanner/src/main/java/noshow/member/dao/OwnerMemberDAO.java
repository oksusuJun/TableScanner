package noshow.member.dao;

import noshow.vo.Restaurant;

public interface OwnerMemberDAO {

      //Restaurant DB저장
      int insertRestaurant(Restaurant rt);
      
      //Restaurant DB수정
      int updateRestaurantById(Restaurant rt);
      
      //Restaurant DB삭제
      int deleteRestaurantByNum(int businessNum);
      
      //Restaurant 조회
      Restaurant selectMemberByNum(int businessNum);
      
}