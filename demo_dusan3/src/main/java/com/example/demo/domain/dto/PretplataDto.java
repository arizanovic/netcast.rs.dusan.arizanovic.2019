package com.example.demo.domain.dto;

import java.sql.Date;

import com.example.demo.domain.Clan;
import com.example.demo.domain.TipPretplate;

public class PretplataDto {
	
	private Long id;
	private Date pocetak;
	private Date kraj;
	private Clan clan;
	private TipPretplate tipPretplate;
	
	
	public PretplataDto() {
		super();
	}
	public PretplataDto(Long id, Date pocetak, Date kraj, Clan clan, TipPretplate tipPretplate) {
		super();
		this.id = id;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.clan = clan;
		this.tipPretplate = tipPretplate;
	}
	public PretplataDto(Date pocetak, Date kraj, Clan clan, TipPretplate tipPretplate) {
		super();
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.clan = clan;
		this.tipPretplate = tipPretplate;
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
	public TipPretplate getTipPretplate() {
		return tipPretplate;
	}
	public void setTipPretplate(TipPretplate tipPretplate) {
		this.tipPretplate = tipPretplate;
	}
	
	
	
	

}
