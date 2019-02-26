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

@Entity
public class Termin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Date pocetak;
	@Column(nullable=false)
	private Date kraj;	
	
	@ManyToOne(targetEntity = Trener.class)
	@JoinColumn(name="trener_id", foreignKey=@ForeignKey(name="trener"))
	private Trener trener;
	@ManyToOne(targetEntity = Clan.class)
	@JoinColumn(name="clan_id", foreignKey=@ForeignKey(name="clan1"))
	private Clan clan;
	
	
	public Termin() {
		super();
	}

	

	public Termin(Date pocetak, Date kraj, Trener trener, Clan clan) {
		super();
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.trener = trener;
		this.clan = clan;
	}



	public Termin(Long id, Date pocetak, Date kraj, Trener trener, Clan clan) {
		super();
		this.id = id;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.trener = trener;
		this.clan = clan;
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


	@Override
	public String toString() {
		return "Termin [id=" + id + ", pocetak=" + pocetak + ", kraj=" + kraj + ", trener=" + trener + ", clan=" + clan
				+ "]";
	}

	
	

	
	
}
