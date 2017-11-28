package noshow.member.service;

import noshow.vo.Restaurant;

public interface OwnerMemberService {
   int insertRestaurant(Restaurant rt);
   int updateRestaurant(Restaurant rt);
   int deleteRestaurant(String businessId);
   Restaurant selectRestaurantByBusinessId(String businessId);
}
