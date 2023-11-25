package com.vam.mapper;

import java.util.List;

import com.vam.VO.MemberVO;

public interface MemberMapper {
	// 회원가입
	public void memberJoin(MemberVO mvo);
	
	// 아이디 중복 검사
	public int idCheck(String id);
	
	// 로그인
	public MemberVO memberLogin(MemberVO mvo);
	
	// 유저 정보 가져오기
	public List<MemberVO> memberGet();
}
