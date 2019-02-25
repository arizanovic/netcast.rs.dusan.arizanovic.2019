package com.example.demo.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.ClanDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.dto.ClanDto;
import com.example.demo.service.ClanService;

@Service
public class ClanImplementation implements ClanService{

	@Autowired
	private ClanDao clanDao;
	/*
	 * @Override public String process(String ime, String prezime, String pol,
	 * Integer godine, String email) { Clan c = new Clan(); c.setIme(ime);
	 * c.setPrezime(prezime); c.setPol(pol); c.setGodine(godine); c.setEmail(email);
	 * clanDao.save(c); return "Uspeo"; }
	 */

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
}
