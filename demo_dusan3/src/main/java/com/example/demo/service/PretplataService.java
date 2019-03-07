package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.PretplataDao;

import com.example.demo.domain.Pretplata;
import com.example.demo.domain.dto.PretplataDto;
import com.example.demo.service.implementation.PretplataInt;

@Service
public class PretplataService implements PretplataInt{

	@Autowired
	private PretplataDao pretplataDao;
	
	@Override
	public String process(PretplataDto pretplataDto) {
		Pretplata p = new Pretplata(); 
		p.setPocetak(pretplataDto.getPocetak());
		p.setKraj(pretplataDto.getKraj());
		p.setTipPretplate(pretplataDto.getTipPretplate());
		pretplataDao.save(p);
		return "added";

	}
	@Override
	public String process1(PretplataDto pretplataDto) {
		Pretplata p = new Pretplata(); 
		p.setId(pretplataDto.getId());
		p.setPocetak(pretplataDto.getPocetak());
		p.setKraj(pretplataDto.getKraj());
		p.setTipPretplate(pretplataDto.getTipPretplate());
		pretplataDao.save(p);
		return "updated";

	}
	
	@Override
	public List<Pretplata> findAll() {	
		return (List<Pretplata>) pretplataDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		pretplataDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Pretplata findById(Long id) {
		Optional<Pretplata> pretplata = pretplataDao.findById(id);
		if(pretplata.isPresent()) {
			return pretplata.get();}
		else {
		return null;
		}
	}
	
}
