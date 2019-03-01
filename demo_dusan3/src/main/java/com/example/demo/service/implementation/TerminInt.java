package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.domain.Termin;
import com.example.demo.domain.dto.TerminDto;
import com.example.demo.domain.dto.VremInterDto;

public interface TerminInt {

	public String process(TerminDto terminDto);
	
	public String process1(TerminDto terminDto);

	public List<Termin> findAll();

	public String deleteById(Long id);

	public Termin findById(Long id);

	public List<Termin> findByVremInter(VremInterDto vremInterDto);
}
