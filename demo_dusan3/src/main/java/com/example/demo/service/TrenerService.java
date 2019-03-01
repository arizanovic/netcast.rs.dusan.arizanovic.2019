package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.TerminDao;
import com.example.demo.dao.TrenerDao;
import com.example.demo.domain.Termin;
import com.example.demo.domain.Trener;
import com.example.demo.domain.dto.TrenerDto;
import com.example.demo.domain.dto.TrenerTerminDto;
import com.example.demo.service.implementation.TrenerInt;

@Service
public class TrenerService implements TrenerInt{

	TrenerDao trenerDao;
	TerminDao terminDao;
	
	@Autowired
	public TrenerService(TrenerDao trenerDao, TerminDao terminDao) {
		super();
		this.trenerDao = trenerDao;
		this.terminDao = terminDao;
	}

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
		if(trener.isPresent()){
			return trener.get();}
		else {
		return null;
		}
	}

	@Override
	@Transactional
	public TrenerTerminDto termin(Long id) {
		Optional<Trener> optionalTrener = trenerDao.findById(id);
		if(optionalTrener.isPresent()) {
			Trener trener = optionalTrener.get();
			List<Termin> termin = terminDao.findByTrener(trener);
			TrenerTerminDto trenerTermin= new TrenerTerminDto();
			trenerTermin.setTrener(trener);
			trenerTermin.setTermin(termin);
			return trenerTermin;
		}
		return null;
	}

	
}