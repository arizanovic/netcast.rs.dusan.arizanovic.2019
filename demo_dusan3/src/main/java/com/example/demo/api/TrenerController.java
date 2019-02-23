package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TrenerDao;

import com.example.demo.domain.Trener;


@RestController
@RequestMapping("/trener")
public class TrenerController {
		/*
		@Autowired
		TrenerDao trenerDao;
		
		
		@GetMapping("/findall")
		public List<Trener> test() {
			
			return (List<Trener>)trenerDao.findAll();
		}
		
		@RequestMapping(value="/termin/save", method=RequestMethod.GET)
		public @RequestBody String process (@RequestParam String ime, @RequestParam String prezime, )
*/
	}