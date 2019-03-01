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
import com.example.demo.dao.TrenerDao;
import com.example.demo.domain.Trener;
import com.example.demo.domain.dto.TrenerDto;
import com.example.demo.domain.dto.TrenerTerminDto;
import com.example.demo.service.TrenerService;
import com.example.demo.service.implementation.TrenerInt;

@RestController
@RequestMapping("/trener")
public class TrenerController {
	
	@Autowired
	TrenerDao trenerDao;
	
	@Autowired
	TrenerInt trenerInt;
	TrenerService trenerService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody TrenerDto trenerDto) {			
		return trenerInt.process(trenerDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public @ResponseBody String process1(@RequestBody TrenerDto trenerDto) {			
		return trenerInt.process1(trenerDto);
	}
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public List<Trener> process(){
		return trenerInt.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Trener getTrener(@PathVariable Long id){
		return trenerInt.findById(id);		
	}	
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return trenerInt.deleteById(id);
	}
	
	@RequestMapping(value="/termin/{id}")
	public TrenerTerminDto termin(@PathVariable Long id) {
		return trenerInt.termin(id);	
	}
}