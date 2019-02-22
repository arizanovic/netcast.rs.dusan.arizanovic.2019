package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="tip_pretplate")
public class TipPretplate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String tip;
	@Column(nullable=false)
	private Double cena;
	
	public TipPretplate() {
		super();
	}

	public TipPretplate(Long id, String tip, double cena) {
		super();
		this.id = id;
		this.tip = tip;
		this.cena = cena;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "TipPretplate [id=" + id + ", tip=" + tip + ", cena=" + cena + "]";
	}
	
	
	
}
