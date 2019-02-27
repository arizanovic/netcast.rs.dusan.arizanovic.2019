package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.TerminDao;
import com.example.demo.domain.Termin;
import com.example.demo.domain.dto.TerminDto;
import com.example.demo.service.implementation.TerminInt;

@Service
public class TerminService implements TerminInt{

	@Autowired
	private TerminDao terminDao;

	@Override
	public String process(TerminDto terminDto) {
		Termin t = new Termin(); 
		t.setPocetak(terminDto.getPocetak());
		t.setKraj(terminDto.getKraj());
		t.setClan(terminDto.getClan());
		t.setTrener(terminDto.getTrener());
		terminDao.save(t); 
		return "added";
	}
	
	@Override
	public String process1(TerminDto terminDto) {
		Termin t = new Termin(); 
		t.setId(terminDto.getId());
		t.setPocetak(terminDto.getPocetak());
		t.setKraj(terminDto.getKraj());
		t.setClan(terminDto.getClan());
		t.setTrener(terminDto.getTrener());
		terminDao.save(t); 
		return "updated";
	}

	
}