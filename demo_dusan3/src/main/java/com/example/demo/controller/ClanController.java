package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ClanDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanUpdateDto;
import com.example.demo.service.implementation.ClanInt;

@RestController
@RequestMapping("/clan")
public class ClanController {

	@Autowired
	ClanDao clanDao;
	
	@Autowired
	private ClanInt clanService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody ClanDto clanDto) {		

		//return clanService.process(ime, prezime, pol, godine, email);	
		return clanService.process(clanDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	//public @ResponseBody String process(@PathVariable Long id, @RequestParam String ime, @RequestParam String prezime, @RequestParam String pol, @RequestParam Integer godine, @RequestParam String email)  {		

	public @ResponseBody String process(@RequestBody ClanUpdateDto clanUpdateDto)  {				
		return clanService.process(clanUpdateDto);
	}
	
	@GetMapping("/findall")
	public List<Clan> test() {		
		return (List<Clan>)clanDao.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Optional<Clan> getClan(@PathVariable Long id) {
		return (Optional<Clan>)clanDao.findById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public String deleteClan(@PathVariable Long id) {
		clanDao.deleteById(id);	
		return "deleted";
	}
}













