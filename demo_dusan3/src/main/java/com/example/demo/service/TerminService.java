package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TerminDao;
import com.example.demo.domain.Termin;
import com.example.demo.domain.dto.TerminDto;
import com.example.demo.domain.dto.VremInterDto;
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
	
	@Override
	public List<Termin> findAll() {	
		return (List<Termin>) terminDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		terminDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Termin findById(Long id) {
		Optional<Termin> termin = terminDao.findById(id);
		if(termin.isPresent()){
			return termin.get();}
		else {
		return null;
		}
	}

	@Override
//	@Transactional
	public List<Termin> findByVremInter(VremInterDto vremInterDto) {
		List<Termin> between = terminDao.findByPocetakAfterAndPocetakBefore(vremInterDto.getPocetak(), vremInterDto.getKraj());
		System.out.println(between.size());
		return between;
}
	
}