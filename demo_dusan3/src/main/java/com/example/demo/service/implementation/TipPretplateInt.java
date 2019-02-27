package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.domain.TipPretplate;
import com.example.demo.domain.dto.TipPretplateDto;

public interface TipPretplateInt {

	public String process(TipPretplateDto tipPretplateDto);

	public String process1(TipPretplateDto tipPretplateDto);

	public List<TipPretplate> findAll();

	public String deleteById(Long id);

	public TipPretplate findById(Long id);
	
}
