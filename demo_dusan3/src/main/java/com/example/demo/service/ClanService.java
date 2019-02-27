package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.ClanDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanUpdateDto;
import com.example.demo.service.implementation.ClanInt;

@Service
public class ClanService implements ClanInt{

	@Autowired
	private ClanDao clanDao;

	@Override
	public String process(ClanDto clanDto) {
		Clan c = new Clan(); 
		c.setIme(clanDto.getIme());
		 c.setPrezime(clanDto.getPrezime()); 
		 c.setPol(clanDto.getPol()); 
		 c.setGodine(clanDto.getGodine());
		 c.setEmail(clanDto.getEmail());
		 clanDao.save(c); 
		 return "Uspeo";
	}

	@Override
	public String process(ClanUpdateDto clanUpdateDto) {
		Clan c = new Clan(); 
		c.setId(clanUpdateDto.getId());
		c.setIme(clanUpdateDto.getIme());
		 c.setPrezime(clanUpdateDto.getPrezime()); 
		 c.setPol(clanUpdateDto.getPol()); 
		 c.setGodine(clanUpdateDto.getGodine());
		 c.setEmail(clanUpdateDto.getEmail());
		 clanDao.save(c); 
		 return "Updated";
	}
	

	@Override
	public List<Clan> findAll() {	
		return (List<Clan>) clanDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		clanDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Clan findById(Long id) {
		Optional<Clan> clan = clanDao.findById(id);
		if(clan.isPresent())
			return clan.get();
		return null;
	}
	
}
