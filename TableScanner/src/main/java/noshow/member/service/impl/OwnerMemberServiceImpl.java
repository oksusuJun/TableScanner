package noshow.member.service.impl;

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
   public int getRtByNum(Restaurant rt) {
      return dao.insertRestaurant(rt);
   }
   
   
}