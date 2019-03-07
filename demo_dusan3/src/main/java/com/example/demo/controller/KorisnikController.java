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
import com.example.demo.dao.KorisnikDao;
import com.example.demo.domain.Korisnik;
import com.example.demo.domain.dto.KorisnikDto;
import com.example.demo.domain.dto.KorisnikLoginDto;
import com.example.demo.security.LoginService;
import com.example.demo.service.implementation.KorisnikInt;
import org.jsondoc.core.annotation.ApiMethod;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/korisnik")
public class KorisnikController {

		@Autowired
		KorisnikDao korisnikDao;

		@Autowired
		private KorisnikInt korisnikInt;
		
		@Autowired
		LoginService loginService;
		
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public @ResponseBody String process(@RequestBody KorisnikDto korisnikDto) {			
			return korisnikInt.process(korisnikDto);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/update/{id}")
		public @ResponseBody String process1(@RequestBody KorisnikDto korisnikDto) {			
			return korisnikInt.process1(korisnikDto);
		}
		
		@RequestMapping(value="/findall", method=RequestMethod.GET)
		public List<Korisnik> process(){
			return korisnikInt.findAll();
		}
		
		@RequestMapping("/find/{id}")
		public Korisnik getKorisnik(@PathVariable Long id){
			return korisnikInt.findById(id);		
		}	
		
		@DeleteMapping(value = "/delete/{id}")
		public String deleteById(@PathVariable Long id) {
			return korisnikInt.deleteById(id);
		}
		
		@ApiMethod(description="login")
		@PostMapping(value="/login")
		public String login(@RequestBody KorisnikLoginDto korisnikLoginDto) {
			return loginService.authorize(korisnikLoginDto);
		}
		
		
	}