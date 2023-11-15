package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vam.VO.MemberVO;
import com.vam.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	MemberService memberservice;
	
	
	// ȸ������ ��ư Ŭ�� ��
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public void memberCheck() throws Exception {
		logger.info("memberCheck ����");
	}
	// ���� Ŭ�� ��
		@RequestMapping(value = "/join", method = RequestMethod.GET)
		public void memberJoin() throws Exception {
			logger.info("memberJoin ����");
		}
		
	//ȸ������
		@RequestMapping(value="/join", method = RequestMethod.POST)
		public String joinPOST(MemberVO mvo) throws Exception {
			
			logger.info("join ����");
			
			// ȸ������ ���� ����
			memberservice.memberJoin(mvo);
			
			logger.info("join service ����");
			
			return "redirect:/main";
		}
		
	// �α��� ��ư Ŭ�� ��
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void memberLogin() throws Exception {
		logger.info("memberLogin ����");
	}
	
	//���̵� �ߺ� �˻�
	@RequestMapping(value = "/idChk", method = RequestMethod.POST)
	@ResponseBody
	public String IdChkPOST(String id) throws Exception {
		
		logger.info("idChk() ����");
		
		int result = memberservice.idCheck(id);
		
		logger.info("����� = " + result);
		
		if(result != 0 ) {
			return "fail"; //�ߺ� ���̵� ����
		} else {
			return "success";
		}
	}
	
	//�̸��� ����
	@RequestMapping(value="/mailCheck", method=RequestMethod.GET)
	@ResponseBody
	public void mailCheckGET(String email) throws Exception{
		
		logger.info("�̸��� ������ ���� Ȯ��");
		logger.info("������ȣ : " + email);
	}
	
}
