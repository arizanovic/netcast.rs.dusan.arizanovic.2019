package com.example.demo.service;

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
		p.setClan(pretplataDto.getClan());
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
		p.setClan(pretplataDto.getClan());
		p.setTipPretplate(pretplataDto.getTipPretplate());
		pretplataDao.save(p);
		return "updated";

	}
	
}
