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
import com.example.demo.dao.TrenerDao;
import com.example.demo.domain.Trener;
import com.example.demo.domain.dto.TrenerDto;
import com.example.demo.service.implementation.TrenerInt;

@RestController
@RequestMapping("/trener")
public class TrenerController {
	
	@Autowired
	TrenerDao trenerDao;
	
	@Autowired
	private TrenerInt trenerService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody TrenerDto trenerDto) {			
		return trenerService.process(trenerDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public @ResponseBody String process1(@RequestBody TrenerDto trenerDto) {			
		return trenerService.process1(trenerDto);
	}
	
	@GetMapping("/findall")
	public List<Trener> test() {		
		return (List<Trener>)trenerDao.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Optional<Trener> getTrener(@PathVariable Long id) {
		return (Optional<Trener>)trenerDao.findById(id);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public String deleteTrener(@PathVariable Long id) {
		trenerDao.deleteById(id);	
		return "deleted";
	}
}