package com.example.demo.domain.dto;

public class TipPretplateDto {

	private Long id;
	private String tip;
	private Double cena;
	
	
	public TipPretplateDto() {
		super();
	}


	public TipPretplateDto(Long id, String tip, Double cena) {
		super();
		this.id = id;
		this.tip = tip;
		this.cena = cena;
	}


	public TipPretplateDto(String tip, Double cena) {
		super();
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


	public Double getCena() {
		return cena;
	}


	public void setCena(Double cena) {
		this.cena = cena;
	}
	
	
	
}
