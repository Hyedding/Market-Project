package com.vam.service;

import com.vam.VO.MemberVO;

public interface MemberService {
	// ȸ������
	public void memberJoin(MemberVO mvo) throws Exception;
	
	//���̵� �ߺ� �˻�
	public int idCheck(String id) throws Exception;
	
}
