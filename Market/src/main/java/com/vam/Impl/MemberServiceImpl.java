package com.vam.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.VO.MemberVO;
import com.vam.mapper.MemberMapper;
import com.vam.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper membermapper;
	@Override
	public void memberJoin(MemberVO mvo) throws Exception {
		 membermapper.memberJoin(mvo);
	}
	@Override
	public int idCheck(String id) throws Exception {
		
		return membermapper.idCheck(id);
	}
}
