package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.Korisnik;

@Repository
public interface KorisnikDao extends CrudRepository<Korisnik, Long>{

	static Korisnik findByEmailAndSifra(String email, String sifra) {
		return null;
	}

	
	
}
