package com.vam.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.VO.ProductVO;
import com.vam.mapper.TransationMapper;
import com.vam.service.TransationService;

@Service
public class TransationServiceImpl implements TransationService {

	@Autowired
	TransationMapper productmapper;
	
	// ��ǰ ��ü����
	@Override
	public List<ProductVO> productList() throws Exception {
		return productmapper.productList();
	}

	// ��ǰ �󼼺���
	@Override
	public ProductVO productGetDetail(int productNo) throws Exception {
	
		return productmapper.productGetDetail(productNo);
	}
}
