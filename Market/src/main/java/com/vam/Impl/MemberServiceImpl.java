package com.vam.Impl;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.VO.MemberVO;
import com.vam.mapper.MemberMapper;
import com.vam.service.MemberService;

import net.nurigo.java_sdk.api.Message;

@Service
public class MemberServiceImpl implements MemberService {

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

	@Override
	public void sendPhoneNumber(String memberPhone, String cerNum) throws Exception {
		String api_key = "NCSVEENROUGXFV4T";
		String api_secret = "VTACPJ4NRZKSMEGW068D0XTOU15SBUZ5";
		Message coolsms = new Message(api_key, api_secret);
		String myMail = "01083404100";
		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", memberPhone); // ������ȭ��ȣ
		params.put("from", myMail); // �߽���ȭ��ȣ. �׽�Ʈ�ÿ��� �߽�,���� �Ѵ� ���� ��ȣ�� �ϸ� ��
		params.put("type", "SMS");
		params.put("text", "[TEST] ������ȣ��" + "[" + cerNum + "]" + "�Դϴ�."); // ���� ���� �Է�
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
}
