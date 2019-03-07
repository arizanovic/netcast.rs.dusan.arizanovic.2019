package com.example.demo.domain.dto;

import com.example.demo.domain.Pretplata;
import com.example.demo.domain.Snizenje;
import com.example.demo.domain.Termin;

public class ClanDto {

	private String ime;
	private String prezime;
	private String pol;
	private Integer godine;
	private String email;
	private Termin termin;
	private Snizenje snizenje;
	private Pretplata pretplata;
	
	public ClanDto() {
		super();
	}

	public ClanDto(String ime, String prezime, String pol, Integer godine, String email, Termin termin,
			Snizenje snizenje, Pretplata pretplata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
		this.termin = termin;
		this.snizenje = snizenje;
		this.pretplata = pretplata;
	}

	public ClanDto(String prezime, String pol, Integer godine, String email, Termin termin, Snizenje snizenje,
			Pretplata pretplata) {
		super();
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
		this.termin = termin;
		this.snizenje = snizenje;
		this.pretplata = pretplata;
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

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Integer getGodine() {
		return godine;
	}

	public void setGodine(Integer godine) {
		this.godine = godine;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Termin getTermin() {
		return termin;
	}

	public void setTermin(Termin termin) {
		this.termin = termin;
	}

	public Snizenje getSnizenje() {
		return snizenje;
	}

	public void setSnizenje(Snizenje snizenje) {
		this.snizenje = snizenje;
	}

	public Pretplata getPretplata() {
		return pretplata;
	}

	public void setPretplata(Pretplata pretplata) {
		this.pretplata = pretplata;
	}
	
	
}