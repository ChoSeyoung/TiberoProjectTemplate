package com.domain.module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.module.dto.TemplateDTO;
import com.domain.module.mapper.TemplateMapper;

@Service
public class TemplateService{

	@Autowired
	TemplateMapper templateMapper;
	
	public String getNow() throws Exception{
		return templateMapper.getNow();
	}
	
}
