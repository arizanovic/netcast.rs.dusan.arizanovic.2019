package com.example.demo_dusan1.modeli;

public class Clan {

	private String ime;
	private String prezime;
	private String email;
	public Clan() {
		super();
	}
	public Clan(String ime, String prezime, String email) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Clan [ime=" + ime + ", prezime=" + prezime + ", email=" + email + "]";
	}
	
	
	
}
