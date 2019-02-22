package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Clan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String ime;
	@Column(nullable=false)
	private String prezime;
	@Column(nullable=false)
	private String pol;
	@Column(nullable=false)
	private Integer godine;	
	@Column(nullable=false)
	private String email;
	
	public Clan(Long id, String ime, String prezime, String pol, Integer godine, String email) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.godine = godine;
		this.email = email;
	}

	public Clan() {
		super();
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

	@Override
	public String toString() {
		return "Clan [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", pol=" + pol + ", godine=" + godine
				+ ", email=" + email + "]";
	}
	
	
	

}
