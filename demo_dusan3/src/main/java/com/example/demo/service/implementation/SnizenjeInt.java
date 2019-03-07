package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.domain.Snizenje;
import com.example.demo.domain.dto.SnizenjeDto;

public interface SnizenjeInt {

	public List<Snizenje> findAll();

	public Snizenje findById(Long id);

	public String deleteById(Long id);

	public String process1(SnizenjeDto snizenjeDto);

	public String process(SnizenjeDto snizenjeDto);

	

}
