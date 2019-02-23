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
import com.example.demo.dao.PretplataDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Pretplata;
import com.example.demo.domain.TipPretplate;

@RestController
@RequestMapping("/pretplata")
public class PreteplataController {
		
		@Autowired
		PretplataDao pretplataDao;
		
		@RequestMapping(value="/save", method=RequestMethod.GET)
		public @ResponseBody String process(@RequestParam Date pocetak, @RequestParam Date kraj, @RequestParam Clan clan, @RequestParam TipPretplate tipPretplate)  {		
			
			Pretplata p = new Pretplata();
			p.setPocetak(pocetak);
			p.setKraj(kraj);
			p.setClan(clan);
			p.setTipPretplate(tipPretplate);

			
			pretplataDao.save(p);
			return "Pretplata saved";	
		}
		
		@GetMapping("/findall")
		public List<Pretplata> test() {		
			return (List<Pretplata>)pretplataDao.findAll();
		}			
	}
