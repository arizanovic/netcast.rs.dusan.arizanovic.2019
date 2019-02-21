package com.example.demo_dusan1.modeli;

import java.sql.Date;

public class Termin {
	private Date start;
	private Date kraj;
	private Trener trener;
	private Clan clan;
	public Termin() {
		super();
	}
	public Termin(Date start, Date kraj, Trener trener, Clan clan) {
		super();
		this.start = start;
		this.kraj = kraj;
		this.trener = trener;
		this.clan = clan;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
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
		return "Termin [start=" + start + ", kraj=" + kraj + ", trener=" + trener + ", clan=" + clan + "]";
	}
	
	
	
	
}
