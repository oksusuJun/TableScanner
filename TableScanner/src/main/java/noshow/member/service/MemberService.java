package noshow.member.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.vo.Member;

public interface MemberService {
	
	int getUserByUserId(Member member);
}
