package com.example.demo.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Trener {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String ime;
	@Column(nullable=false)
	private String prezime;
	@Column(nullable=false)
	private double cena;
	@Column(nullable=false)
	private Long brojTreninga;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trener")
	@JsonBackReference
	private List<Termin> termin;
	
	public Trener() {
		super();
	}

	public Trener(Long id, String ime, String prezime, double cena, Long brojTreninga, List<Termin> termin) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.cena = cena;
		this.brojTreninga = brojTreninga;
		this.termin = termin;
	}

	public Trener(String ime, String prezime, double cena, Long brojTreninga, List<Termin> termin) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.cena = cena;
		this.brojTreninga = brojTreninga;
		this.termin = termin;
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

	public Long getBrojTreninga() {
		return brojTreninga;
	}

	public void setBrojTreninga(Long brojTreninga) {
		this.brojTreninga = brojTreninga;
	}

	public List<Termin> getTermin() {
		return termin;
	}

	public void setTermin(List<Termin> termin) {
		this.termin = termin;
	}

	@Override
	public String toString() {
		return "Trener [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", cena=" + cena + ", brojTreninga="
				+ brojTreninga + ", termin=" + termin + "]";
	}

	
	
}
