package com.vam.mapper;

import java.util.List;

import com.vam.VO.MemberVO;

public interface MemberMapper {
	// ȸ������
	public void memberJoin(MemberVO mvo);
	
	// ���̵� �ߺ� �˻�
	public int idCheck(String id);
	
	// �α���
	public MemberVO memberLogin(MemberVO mvo);
	
	// ���� ���� ��������
	public List<MemberVO> memberGet();
}
