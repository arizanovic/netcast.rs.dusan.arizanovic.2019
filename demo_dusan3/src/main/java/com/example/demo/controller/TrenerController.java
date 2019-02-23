package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.TrenerDao;
import com.example.demo.domain.Trener;

@RestController
@RequestMapping("/trener")
public class TrenerController {
	
	@Autowired
	TrenerDao trenerDao;
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public @ResponseBody String process(@RequestParam String ime, @RequestParam String prezime, @RequestParam Double cena)  {		

		Trener t = new Trener();
		t.setIme(ime);
		t.setPrezime(prezime);
		t.setCena(cena);
		trenerDao.save(t);
		return "Trener saved";	
	}
	
	@GetMapping("/findall")
	public List<Trener> process(){
		return (List<Trener>)trenerDao.findAll();
	}
}