package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TerminDao;
import com.example.demo.domain.Termin;
/*
	@RestController
	@RequestMapping("/trener")
	public class TerminController {
			
			@Autowired
			TerminDao terminDao;
			
			@RequestMapping(value="/termin/save", method=RequestMethod.GET)
			public @RequestBody String process (@RequestParam String ime, @RequestParam String prezime, )
			
		}*/