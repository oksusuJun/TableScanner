package noshow.member.dao;

import java.util.List;

import noshow.vo.Restaurant;

public interface OwnerMemberDAO {

      //Restaurant DB저장
      int insertRestaurant(Restaurant rt);
      
      //Restaurant DB수정
      int updateRestaurant(Restaurant rt);
      
      //Restaurant DB삭제
      int deleteRestaurant(String businessId);

      //Restaurant 조회
      List<Restaurant> selectRestaurantByBusinessId(String businessId);

      
}