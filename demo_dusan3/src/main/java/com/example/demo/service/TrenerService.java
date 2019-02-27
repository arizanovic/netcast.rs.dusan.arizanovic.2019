package com.example.demo.service;

import java.util.List;
import java.util.Optional;
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
	
	@Override
	public List<Trener> findAll() {	
		return (List<Trener>) trenerDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		trenerDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Trener findById(Long id) {
		Optional<Trener> trener = trenerDao.findById(id);
		if(trener.isPresent())
			return trener.get();
		return null;
	}

	
}