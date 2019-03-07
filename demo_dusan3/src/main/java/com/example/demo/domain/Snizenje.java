package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="snizenje")
public class Snizenje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private double snizenje;
	@Column(nullable=false)
	private String tip;	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "snizenje")
	@JsonBackReference
	private List<Clan> clan;

	public Snizenje() {
		super();
	}

	public Snizenje(Long id, double snizenje, String tip, List<Clan> clan) {
		super();
		this.id = id;
		this.snizenje = snizenje;
		this.tip = tip;
		this.clan = clan;
	}

	public Snizenje(double snizenje, String tip, List<Clan> clan) {
		super();
		this.snizenje = snizenje;
		this.tip = tip;
		this.clan = clan;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getSnizenje() {
		return snizenje;
	}

	public void setSnizenje(double snizenje) {
		this.snizenje = snizenje;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public List<Clan> getClan() {
		return clan;
	}

	public void setClan(List<Clan> clan) {
		this.clan = clan;
	}

	@Override
	public String toString() {
		return "Snizenje [id=" + id + ", snizenje=" + snizenje + ", tip=" + tip + ", clan=" + clan + "]";
	}
	
	

}
