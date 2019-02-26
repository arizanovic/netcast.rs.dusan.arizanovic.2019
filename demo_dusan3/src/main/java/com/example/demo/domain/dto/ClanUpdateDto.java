package com.example.demo.domain.dto;

public class ClanUpdateDto {
	
	private Long id;
	private String ime;
	private String prezime;
	private String pol;
	private Integer godine;
	private String email;
	
	public ClanUpdateDto() {
		super();
	}

	public ClanUpdateDto(Long id, String ime, String prezime, String pol, Integer godine, String email) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
	}
	
	public ClanUpdateDto(String ime, String prezime, String pol, Integer godine, String email) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public Integer getGodine() {
		return godine;
	}

	public void setGodine(Integer godine) {
		this.godine = godine;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
