package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SnizenjeDao;
import com.example.demo.domain.Snizenje;
import com.example.demo.domain.dto.SnizenjeDto;
import com.example.demo.service.implementation.SnizenjeInt;

@Service
public class SnizenjeService implements SnizenjeInt{
	
	@Autowired
	private SnizenjeDao snizenjeDao;

	@Override
	public String process(SnizenjeDto snizenjeDto) {
		Snizenje s = new Snizenje(); 
		s.setSnizenje(snizenjeDto.getSnizenje());	
		s.setTip(snizenjeDto.getTip());
		snizenjeDao.save(s); 
		return "added";
	}
	
	@Override
	public String process1(SnizenjeDto snizenjeDto) {
		Snizenje s = new Snizenje();
		s.setId(snizenjeDto.getId());
		s.setSnizenje(snizenjeDto.getSnizenje());	
		s.setTip(snizenjeDto.getTip());
		snizenjeDao.save(s); 
		return "updated";
	}
	
	@Override
	public List<Snizenje> findAll() {	
		return (List<Snizenje>) snizenjeDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		snizenjeDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Snizenje findById(Long id) {
		Optional<Snizenje> snizenje = snizenjeDao.findById(id);
		if(snizenje.isPresent()){
			return snizenje.get();}
		else {
		return null;
		}
	}

	
	
}