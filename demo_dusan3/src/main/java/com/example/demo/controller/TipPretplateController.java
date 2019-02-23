package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.TipPretplateDao;
import com.example.demo.domain.TipPretplate;

@RestController
@RequestMapping("/tippretplate")
public class TipPretplateController {

	@Autowired
	TipPretplateDao tippretplateDao;
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public @ResponseBody String process(@RequestParam String tip, @RequestParam double cena)  {		

		TipPretplate t = new TipPretplate();
		t.setTip(tip);
		t.setCena(cena);
		tippretplateDao.save(t);
		return "TipPretplate saved";	
	}
	
	@GetMapping("/findall")
	public List<TipPretplate> test() {		
		return (List<TipPretplate>)tippretplateDao.findAll();
	}
}


