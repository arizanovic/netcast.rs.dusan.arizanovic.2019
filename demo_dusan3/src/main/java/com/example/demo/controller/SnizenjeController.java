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
import com.example.demo.dao.SnizenjeDao;
import com.example.demo.domain.Snizenje;
import com.example.demo.domain.dto.SnizenjeDto;
import com.example.demo.service.implementation.SnizenjeInt;

@RestController
@RequestMapping("/snizenje")
public class SnizenjeController {

		@Autowired
		SnizenjeDao snizenjeDao;

		@Autowired
		private SnizenjeInt snizenjeInt;
		
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public @ResponseBody String process(@RequestBody SnizenjeDto snizenjeDto) {			
			return snizenjeInt.process(snizenjeDto);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
		public @ResponseBody String process1(@RequestBody SnizenjeDto snizenjeDto) {			
			return snizenjeInt.process1(snizenjeDto);
		}
		
		@RequestMapping(value="/findall", method=RequestMethod.GET)
		public List<Snizenje> process(){
			return snizenjeInt.findAll();
		}
		
		@RequestMapping("/find/{id}")
		public Snizenje getSnizenje(@PathVariable Long id){
			return snizenjeInt.findById(id);		
		}	
		
		@DeleteMapping(value = "/delete/{id}")
		public String deleteById(@PathVariable Long id) {
			return snizenjeInt.deleteById(id);
		}
	}