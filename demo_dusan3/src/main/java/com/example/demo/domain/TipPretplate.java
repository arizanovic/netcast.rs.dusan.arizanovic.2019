package com.example.demo.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.example.demo.domain.Pretplata;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity(name="tip_pretplate")
public class TipPretplate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String tip;
	@Column(nullable=false)
	private double cena;	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipPretplate")
	@JsonBackReference
	private List<Pretplata> pretplata;
	
	public TipPretplate() {
		super();
	}

	public TipPretplate(String tip, Double cena, List<Pretplata> pretplata) {
		super();
		this.tip = tip;
		this.cena = cena;
		this.pretplata = pretplata;
	}

	public TipPretplate(Long id, String tip, Double cena, List<Pretplata> pretplata) {
		super();
		this.id = id;
		this.tip = tip;
		this.cena = cena;
		this.pretplata = pretplata;
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

	public List<Pretplata> getPretplata() {
		return pretplata;
	}

	public void setPretplata(List<Pretplata> pretplata) {
		this.pretplata = pretplata;
	}

	@Override
	public String toString() {
		return "TipPretplate [id=" + id + ", tip=" + tip + ", cena=" + cena + ", pretplata=" + pretplata + "]";
	}


	
}
