package com.example.demo.domain.dto;

public class KorisnikLoginDto {

	private String email;
	private String sifra;
	
	public KorisnikLoginDto() {
		super();
	}

	public KorisnikLoginDto(String email, String sifra) {
		super();
		this.email = email;
		this.sifra = sifra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	
	
	
}
