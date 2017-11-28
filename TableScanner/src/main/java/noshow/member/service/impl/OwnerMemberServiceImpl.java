package noshow.member.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.member.dao.OwnerMemberDAO;
import noshow.member.service.OwnerMemberService;
import noshow.vo.Restaurant;

@Service
public class OwnerMemberServiceImpl implements OwnerMemberService{
   
   @Resource
   private OwnerMemberDAO dao;

	@Override
	public int insertRestaurant(Restaurant rt) {
		return dao.insertRestaurant(rt);
	}
	
	@Override
	public int updateRestaurant(Restaurant rt) {
		return dao.updateRestaurant(rt);
	}
	
	@Override
	public int deleteRestaurant(String businessId) {
		return dao.deleteRestaurant(businessId);
	}

	@Override
	public List<Restaurant> selectRestaurantByBusinessId(String businessId) {
		return dao.selectRestaurantByBusinessId(businessId);
	}

	

   
   
   
}