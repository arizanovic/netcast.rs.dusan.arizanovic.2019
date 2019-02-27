package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.domain.Pretplata;
import com.example.demo.domain.dto.PretplataDto;

public interface PretplataInt {

	public String process(PretplataDto pretplataDto);

	public String process1(PretplataDto pretplataDto);

	public List<Pretplata> findAll();

	public String deleteById(Long id);

	public Pretplata findById(Long id);

}
