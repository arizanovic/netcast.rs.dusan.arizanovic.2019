package com.example.demo.domain.dto;

import java.util.Date;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Korisnik;
import com.example.demo.domain.Trener;

public class TerminDto {
	
	private Long id;
	private Date pocetak;
	private Date kraj;
	private Trener trener;
	private Clan clan;
	private Date datum;
	private double cena;
	private Korisnik korisnik;
	
	
	public TerminDto() {
		super();
	}




	public TerminDto(Date pocetak, Date kraj, Trener trener, Clan clan, Date datum, double cena, Korisnik korisnik) {
		super();
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.trener = trener;
		this.clan = clan;
		this.datum = datum;
		this.cena = cena;
		this.korisnik = korisnik;
	}




	public TerminDto(Long id, Date pocetak, Date kraj, Trener trener, Clan clan, Date datum, double cena,
			Korisnik korisnik) {
		super();
		this.id = id;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.trener = trener;
		this.clan = clan;
		this.datum = datum;
		this.cena = cena;
		this.korisnik = korisnik;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getPocetak() {
		return pocetak;
	}


	public void setPocetak(Date pocetak) {
		this.pocetak = pocetak;
	}


	public Date getKraj() {
		return kraj;
	}


	public void setKraj(Date kraj) {
		this.kraj = kraj;
	}


	public Trener getTrener() {
		return trener;
	}


	public void setTrener(Trener trener) {
		this.trener = trener;
	}


	public Clan getClan() {
		return clan;
	}


	public void setClan(Clan clan) {
		this.clan = clan;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	@Override
	public String toString() {
		return "TerminDto [id=" + id + ", pocetak=" + pocetak + ", kraj=" + kraj + ", trener=" + trener + ", clan="
				+ clan + ", datum=" + datum + ", cena=" + cena + ", korisnik=" + korisnik + "]";
	}
	
}
