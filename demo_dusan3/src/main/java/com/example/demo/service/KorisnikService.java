package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.KorisnikDao;
import com.example.demo.domain.Korisnik;
import com.example.demo.domain.dto.KorisnikDto;
import com.example.demo.service.implementation.KorisnikInt;

@Service
public class KorisnikService implements KorisnikInt{
	
	@Autowired
	private KorisnikDao korisnikDao;

	@Override
	public String process(KorisnikDto korisnikDto) {
		Korisnik k = new Korisnik(); 
		k.setIme(korisnikDto.getIme());
		k.setPrezime(korisnikDto.getPrezime());
		k.setKorisnickoIme(korisnikDto.getKorisnickoIme());
		k.setSifra(korisnikDto.getSifra());	
		k.setEmail(korisnikDto.getEmail());
		korisnikDao.save(k); 
		return "added";
	}
	
	@Override
	public String process1(KorisnikDto korisnikDto) {
		Korisnik k = new Korisnik(); 
		k.setId(korisnikDto.getId());
		k.setIme(korisnikDto.getIme());
		k.setPrezime(korisnikDto.getPrezime());
		k.setKorisnickoIme(korisnikDto.getKorisnickoIme());
		k.setSifra(korisnikDto.getSifra());	
		k.setEmail(korisnikDto.getEmail());
		korisnikDao.save(k); 
		return "updated";
	}
	
	@Override
	public List<Korisnik> findAll() {	
		return (List<Korisnik>) korisnikDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		korisnikDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Korisnik findById(Long id) {
		Optional<Korisnik> korisnik = korisnikDao.findById(id);
		if(korisnik.isPresent()){
			return korisnik.get();}
		else {
		return null;
		}
	}

	
}