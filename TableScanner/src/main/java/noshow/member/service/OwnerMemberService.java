package noshow.member.service;

import java.util.List;

import noshow.vo.Restaurant;

public interface OwnerMemberService {
   int insertRestaurant(Restaurant rt);
   int updateRestaurant(Restaurant rt);
   int deleteRestaurant(String businessId);
   List<Restaurant> selectRestaurantByBusinessId(String businessId);
}
