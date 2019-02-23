package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ClanDao;
import com.example.demo.domain.Clan;

@RestController
@RequestMapping("/clan")
public class ClanController {

	@Autowired
	ClanDao clanDao;
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public @ResponseBody String process(@RequestParam String ime, @RequestParam String prezime, @RequestParam String pol, @RequestParam Integer godine, @RequestParam String email)  {		

		Clan c = new Clan();
		c.setIme(ime);
		c.setPrezime(prezime);
		c.setPol(pol);
		c.setGodine(godine);
		c.setEmail(email);		
		clanDao.save(c);
		return "Clanfindall saved";	
	}
	
	@GetMapping("/findall")
	public List<Clan> test() {		
		return (List<Clan>)clanDao.findAll();
	}
}
