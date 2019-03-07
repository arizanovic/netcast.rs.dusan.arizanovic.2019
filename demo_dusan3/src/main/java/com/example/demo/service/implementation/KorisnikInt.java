package com.example.demo.service.implementation;

import java.util.List;
import com.example.demo.domain.Korisnik;
import com.example.demo.domain.dto.KorisnikDto;

public interface KorisnikInt {

	public String process(KorisnikDto korisnikDto);

	public String process1(KorisnikDto korisnikDto);

	public List<Korisnik> findAll();

	public String deleteById(Long id);

	public Korisnik findById(Long id);

}
