package com.example.demo.controller;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.TerminDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Termin;
import com.example.demo.domain.Trener;

	@RestController
	@RequestMapping("/termin")
	public class TerminController {
			
			@Autowired
			TerminDao terminDao;
			
			@RequestMapping(value="/save", method=RequestMethod.GET)
			public @ResponseBody String process(@RequestParam Date pocetak, @RequestParam Date kraj, @RequestParam Clan clan, @RequestParam Trener trener)  {		
				
				Termin t = new Termin();
				t.setPocetak(pocetak);
				t.setKraj(kraj);
				t.setClan(clan);
				t.setTrener(trener);
				
				terminDao.save(t);
				return "Pretplata saved";	
			}
			
			@GetMapping("/findall")
			public List<Termin> test() {		
				return (List<Termin>)terminDao.findAll();
			}			
		}