package com.example.demo_dusan1.modeli;

public class Trener {
	private String ime;
	private String prezime;
	private Long godine;
	private String pol;
	private Double cena;
	
	
	public Trener() {
		super();
	}
	public Trener(String ime, String prezime, Long godine, String pol, Double cena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.pol = pol;
		this.cena = cena;
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
	public Long getGodine() {
		return godine;
	}
	public void setGodine(Long godine) {
		this.godine = godine;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	@Override
	public String toString() {
		return "Trener [ime=" + ime + ", prezime=" + prezime + ", godine=" + godine + ", pol=" + pol + ", cena=" + cena
				+ "]";
	}
	
	
	
}
