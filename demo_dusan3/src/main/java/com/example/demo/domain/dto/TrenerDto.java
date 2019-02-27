package com.example.demo.domain.dto;


public class TrenerDto {

	private Long id;
	private String ime;
	private String prezime;
	private double cena;
	
	public TrenerDto() {
		super();
	}
	public TrenerDto(Long id, String ime, String prezime, double cena) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.cena = cena;
	}
	public TrenerDto(String ime, String prezime, double cena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.cena = cena;
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
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	
}
