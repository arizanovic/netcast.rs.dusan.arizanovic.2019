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
import com.example.demo.dao.PretplataDao;
import com.example.demo.domain.Pretplata;
import com.example.demo.domain.dto.PretplataDto;
import com.example.demo.service.implementation.PretplataInt;
import com.example.demo.controller.PreteplataController;

@RestController
@RequestMapping("/pretplata")
public class PreteplataController {

	@Autowired
	PretplataDao pretplataDao;
	
	@Autowired
	private PretplataInt pretplataService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody PretplataDto pretplataDto) {			
		return pretplataService.process(pretplataDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public @ResponseBody String process1(@RequestBody PretplataDto pretplataDto)  {				
		return pretplataService.process1(pretplataDto);
	}
	
	@GetMapping("/findall")
	public List<Pretplata> test() {		
		return (List<Pretplata>)pretplataDao.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Optional<Pretplata> getPretplata(@PathVariable Long id) {
		return (Optional<Pretplata>)pretplataDao.findById(id);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public String deletePretplata(@PathVariable Long id) {
		pretplataDao.deleteById(id);	
		return "deleted";
	}
}
