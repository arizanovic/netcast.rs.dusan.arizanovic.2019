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
import com.example.demo.dao.PretplataDao;
import com.example.demo.domain.Clan;
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
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public List<Pretplata> process(){
		return pretplataService.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Pretplata getPretplata(@PathVariable Long id){
		return pretplataService.findById(id);		
	}	
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return pretplataService.deleteById(id);
	}
}
