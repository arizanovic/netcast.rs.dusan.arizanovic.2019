package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.TipPretplateDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Termin;
import com.example.demo.domain.TipPretplate;
import com.example.demo.domain.dto.TipPretplateDto;
import com.example.demo.service.implementation.TipPretplateInt;

@RestController
@RequestMapping("/tipPretplate")
public class TipPretplateController {

	@Autowired
	TipPretplateDao tipPretplateDao;

	@Autowired
	private TipPretplateInt tipPretplateService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody TipPretplateDto tipPretplateDto) {			
		return tipPretplateService.process(tipPretplateDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public @ResponseBody String process1(@RequestBody TipPretplateDto tipPretplateDto) {			
		return tipPretplateService.process1(tipPretplateDto);
	}
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public List<TipPretplate> process(){
		return tipPretplateService.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public TipPretplate getTipPretplate(@PathVariable Long id){
		return tipPretplateService.findById(id);		
	}	
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return tipPretplateService.deleteById(id);
	}
}