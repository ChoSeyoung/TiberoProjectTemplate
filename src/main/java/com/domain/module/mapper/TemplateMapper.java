package com.domain.module.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.domain.module.dto.TemplateDTO;

@Repository
public interface TemplateMapper {
	public String getNow() throws Exception;
}
