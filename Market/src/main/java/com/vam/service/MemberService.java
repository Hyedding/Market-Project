package com.vam.service;

import com.vam.VO.MemberVO;

public interface MemberService {
	// ȸ������
	public void memberJoin(MemberVO mvo) throws Exception;
	
	//���̵� �ߺ� �˻�
	public int idCheck(String id) throws Exception;
	
	// �޴�������
	public void sendPhoneNumber(String memberPhone, String cerNum) throws Exception;
	
	// �α���
	public MemberVO memberLogin(MemberVO mvo) throws Exception;
}
