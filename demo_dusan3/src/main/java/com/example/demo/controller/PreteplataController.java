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
	private PretplataInt pretplataInt;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String process(@RequestBody PretplataDto pretplataDto) {			
		return pretplataInt.process(pretplataDto);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
	public @ResponseBody String process1(@RequestBody PretplataDto pretplataDto)  {				
		return pretplataInt.process1(pretplataDto);
	}
	
	@RequestMapping(value="/findall", method=RequestMethod.GET)
	public List<Pretplata> process(){
		return pretplataInt.findAll();
	}
	
	@RequestMapping("/find/{id}")
	public Pretplata getPretplata(@PathVariable Long id){
		return pretplataInt.findById(id);		
	}	
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable Long id) {
		return pretplataInt.deleteById(id);
	}
}
