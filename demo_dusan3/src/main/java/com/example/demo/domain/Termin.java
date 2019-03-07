package com.example.demo.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Termin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
	@Column(nullable=false)
	private Date pocetak;
	
	@Temporal(TemporalType.TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
	@Column(nullable=false)
	private Date kraj;	
	
	@ManyToOne(targetEntity = Clan.class)
	@JoinColumn(name="clan_id", foreignKey=@ForeignKey(name="clan1"))
	private Clan clan;
	
	@ManyToOne(targetEntity = Trener.class)
	@JoinColumn(name="trener_id", foreignKey=@ForeignKey(name="trener"))
	private Trener trener;
	
	@ManyToOne(targetEntity = Korisnik.class)
	@JoinColumn(name="korisnik_id", foreignKey=@ForeignKey(name="korisnik"))
	private Korisnik korisnik;

	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(nullable=false)
	private Date datum;
	
	@Column(nullable=false)
	private double cena;
	
	
	public Termin() {
		super();
	}



	public Termin(Long id, Date pocetak, Date kraj, Clan clan, Trener trener, Date datum, double cena,
			Korisnik korisnik) {
		super();
		this.id = id;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.clan = clan;
		this.trener = trener;
		this.datum = datum;
		this.cena = cena;
		this.korisnik = korisnik;
	}



	public Termin(Date pocetak, Date kraj, Clan clan, Trener trener, Date datum, double cena, Korisnik korisnik) {
		super();
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.clan = clan;
		this.trener = trener;
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



	public Clan getClan() {
		return clan;
	}



	public void setClan(Clan clan) {
		this.clan = clan;
	}



	public Trener getTrener() {
		return trener;
	}



	public void setTrener(Trener trener) {
		this.trener = trener;
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
		return "Termin [id=" + id + ", pocetak=" + pocetak + ", kraj=" + kraj + ", clan=" + clan + ", trener=" + trener
				+ ", datum=" + datum + ", cena=" + cena + ", korisnik=" + korisnik + "]";
	}


	
	
}