package com.example.demo_dusan1.modeli;

import java.sql.Date;

public class Pretplata {
	private Date pocetak;
	private Date kraj;
	private TipPretplate tipPretplate;
	private Clan clan;
	
	public Pretplata() {
		super();
	}

	public Pretplata(Date pocetak, Date kraj, TipPretplate tipPretplate, Clan clan) {
		super();
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.tipPretplate = tipPretplate;
		this.clan = clan;
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

	public TipPretplate getTipPretplate() {
		return tipPretplate;
	}

	public void setTipPretplate(TipPretplate tipPretplate) {
		this.tipPretplate = tipPretplate;
	}

	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	@Override
	public String toString() {
		return "Pretplata [pocetak=" + pocetak + ", kraj=" + kraj + ", tipPretplate=" + tipPretplate + ", clan=" + clan
				+ "]";
	}
	
	
	
}
