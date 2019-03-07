package com.example.demo.security;

import java.time.Instant;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.dao.KorisnikDao;
import com.example.demo.domain.Korisnik;
import com.example.demo.domain.dto.KorisnikLoginDto;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class LoginService {
	
	@Autowired
	KorisnikDao korisnikDao;
	
	public static final String KEY = "1335A";

	public LoginService() {
		super();
	}
	
	public String authorize(KorisnikLoginDto korisnikLoginDto) {
		Korisnik korisnik= korisnikDao.findByEmailAndSifra(korisnikLoginDto.getEmail(), korisnikLoginDto.getSifra());
		if(korisnik!=null) {
			String jws = Jwts.builder().setIssuer(korisnik.getIme())
					.setSubject(korisnik.getEmail())
					.claim("ime", korisnik.getIme()+""+korisnik.getPrezime())
					.setIssuedAt(Date.from(Instant.ofEpochSecond(1466796822L)))
					.signWith( SignatureAlgorithm.HS256,KEY).compact();
			return jws;
		}
		return "Nepoznat korisnik!";	
	}
	
	public String getKorisnikEmail(@RequestParam String token) {
		Jws<Claims> jws = Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);
		
		return jws.getBody().getSubject() ;
	}
	
	public boolean checkToken( String token) {
		String korisnikEmail = this.getKorisnikEmail(token);
		return korisnikEmail != null;
	}
}
