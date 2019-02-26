package com.example.demo.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trener")
	private List<Termin> termin;
	
	public Trener() {
		super();
	}
	

	public Trener(String ime, String prezime, double cena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.cena = cena;
	}



	public Trener(Long id, String ime, String prezime, double cena) {
		super();
		this.id = id;
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

	@Override
	public String toString() {
		return "Trener [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", cena=" + cena + "]";
	}
	
	
	
}
