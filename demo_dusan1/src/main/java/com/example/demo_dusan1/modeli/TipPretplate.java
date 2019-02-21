package com.example.demo_dusan1.modeli;

public class TipPretplate {

	private String tip;
	private Double cena;
	
	public TipPretplate() {
		super();
	}

	public TipPretplate(String tip, Double cena) {
		super();
		this.tip = tip;
		this.cena = cena;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "TipPretplate [tip=" + tip + ", cena=" + cena + "]";
	}
	
	
	
}
