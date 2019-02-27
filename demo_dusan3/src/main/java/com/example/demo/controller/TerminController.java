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
		private TerminInt terminService;
		
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public @ResponseBody String process(@RequestBody TerminDto terminDto) {			
			return terminService.process(terminDto);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
		public @ResponseBody String process1(@RequestBody TerminDto terminDto) {			
			return terminService.process1(terminDto);
		}
		
		@GetMapping("/findall")
		public List<Termin> test() {		
			return (List<Termin>)terminDao.findAll();
		}
		
		@RequestMapping("/find/{id}")
		public Optional<Termin> getTermin(@PathVariable Long id) {
			return (Optional<Termin>)terminDao.findById(id);		
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
		public String deleteTermin(@PathVariable Long id) {
			terminDao.deleteById(id);	
			return "deleted";
		}
	}