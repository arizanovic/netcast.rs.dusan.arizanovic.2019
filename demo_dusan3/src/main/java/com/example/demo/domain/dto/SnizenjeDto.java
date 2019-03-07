package com.example.demo.domain.dto;

public class SnizenjeDto {
	
	private Long id;
	private double snizenje;
	private String tip;
	
	public SnizenjeDto() {
		super();
	}

	public SnizenjeDto(Long id, double snizenje, String tip) {
		super();
		this.id = id;
		this.snizenje = snizenje;
		this.tip = tip;
	}

	public SnizenjeDto(double snizenje, String tip) {
		super();
		this.snizenje = snizenje;
		this.tip = tip;
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
	
	
}
