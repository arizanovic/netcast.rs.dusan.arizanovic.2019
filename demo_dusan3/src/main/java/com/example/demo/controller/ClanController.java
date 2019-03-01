package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ClanDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanTerminDto;
import com.example.demo.domain.dto.ClanUpdateDto;
import com.example.demo.service.ClanService;
import com.example.demo.service.implementation.ClanInt;

@RestController
@RequestMapping("/clan")
public class ClanController {

	@Autowired
	ClanDao clanDao;
	
	@Autowired
	ClanInt clanInt;
	ClanService clanService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody ClanDto clanDto) {			
		return clanInt.process(clanDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public @ResponseBody String process(@RequestBody ClanUpdateDto clanUpdateDto)  {				
		return clanInt.process(clanUpdateDto);
	}
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public List<Clan> process(){
		return clanInt.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Clan getClan(@PathVariable Long id){
		return clanInt.findById(id);		
	}	
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return clanInt.deleteById(id);
	}
	
	@RequestMapping(value = "/termin/{id}")
	public ClanTerminDto clanTermin(@PathVariable Long id) {
		return clanInt.clanTermin(id);
	}	
}


