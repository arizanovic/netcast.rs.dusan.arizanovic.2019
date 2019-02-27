package com.example.demo.domain.dto;

import java.util.Date;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Trener;

public class TerminDto {
	
	private Long id;
	private Date pocetak;
	private Date kraj;
	private Trener trener;
	private Clan clan;
	
	
	public TerminDto() {
		super();
	}
	public TerminDto(Long id, Date pocetak, Date kraj, Trener trener, Clan clan) {
		super();
		this.id = id;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.trener = trener;
		this.clan = clan;
	}
	public TerminDto(Date pocetak, Date kraj, Trener trener, Clan clan) {
		super();
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
	
}
