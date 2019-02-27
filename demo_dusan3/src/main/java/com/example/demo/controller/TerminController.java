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
import com.example.demo.dao.TerminDao;
import com.example.demo.domain.Termin;
import com.example.demo.domain.dto.TerminDto;
import com.example.demo.service.implementation.TerminInt;

	@RestController
	@RequestMapping("/termin")
	public class TerminController {

		@Autowired
		TerminDao terminDao;
		
		@Autowired
		private TerminInt terminInt;
		
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public @ResponseBody String process(@RequestBody TerminDto terminDto) {			
			return terminInt.process(terminDto);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
		public @ResponseBody String process1(@RequestBody TerminDto terminDto) {			
			return terminInt.process1(terminDto);
		}
		

		@RequestMapping(value="/findall", method=RequestMethod.GET)
		public List<Termin> process(){
			return terminInt.findAll();
		}
		
		@RequestMapping("/find/{id}")
		public Termin getTermin(@PathVariable Long id){
			return terminInt.findById(id);		
		}	
		
		@DeleteMapping(value = "/delete/{id}")
		public String deleteById(@PathVariable Long id) {
			return terminInt.deleteById(id);
		}
	}