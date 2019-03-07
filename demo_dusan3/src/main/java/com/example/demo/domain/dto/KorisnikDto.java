package com.example.demo.domain.dto;

public class KorisnikDto {

	
	private Long id;
	private String ime;
	private String prezime;	
	private String korisnickoIme;
	private String sifra;
	private String email;
	
	public KorisnikDto() {
		super();
	}

	public KorisnikDto(Long id, String ime, String prezime, String korisnickoIme, String sifra, String email) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
		this.email = email;
	}

	public KorisnikDto(String ime, String prezime, String korisnickoIme, String sifra, String email) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
