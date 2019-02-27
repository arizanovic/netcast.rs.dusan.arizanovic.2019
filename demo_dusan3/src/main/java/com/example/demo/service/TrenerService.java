package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.TrenerDao;
import com.example.demo.domain.Trener;
import com.example.demo.domain.dto.TrenerDto;
import com.example.demo.service.implementation.TrenerInt;

@Service
public class TrenerService implements TrenerInt{

	@Autowired
	private TrenerDao trenerDao;

	@Override
	public String process(TrenerDto trenerDto) {
		Trener t = new Trener(); 
		t.setIme(trenerDto.getIme());
		t.setPrezime(trenerDto.getPrezime());
		t.setCena(trenerDto.getCena());
		trenerDao.save(t); 
		return "added";
	}
	
	@Override
	public String process1(TrenerDto trenerDto) {
		Trener t = new Trener(); 
		t.setId(trenerDto.getId());
		t.setIme(trenerDto.getIme());
		t.setPrezime(trenerDto.getPrezime());
		t.setCena(trenerDto.getCena());
		trenerDao.save(t); 
		return "updated";
	}

	
}