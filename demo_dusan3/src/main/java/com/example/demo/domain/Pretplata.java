package com.example.demo.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Pretplata {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private Date pocetak;
	@Column(nullable=false)
	private Date kraj;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pretplata")
	@JsonBackReference
	private List<Clan> clan;
	
	@ManyToOne(targetEntity = TipPretplate.class)
    @JoinColumn(name = "tip_pretplate_id", foreignKey = @ForeignKey(name = "tip_pretplate"))
    private TipPretplate tipPretplate;

	public Pretplata() {
		super();
	}

	public Pretplata(Long id, Date pocetak, Date kraj, List<Clan> clan, TipPretplate tipPretplate) {
		super();
		this.id = id;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.clan = clan;
		this.tipPretplate = tipPretplate;
	}

	public Pretplata(Date pocetak, Date kraj, List<Clan> clan, TipPretplate tipPretplate) {
		super();
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.clan = clan;
		this.tipPretplate = tipPretplate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Clan> getClan() {
		return clan;
	}

	public void setClan(List<Clan> clan) {
		this.clan = clan;
	}

	public TipPretplate getTipPretplate() {
		return tipPretplate;
	}

	public void setTipPretplate(TipPretplate tipPretplate) {
		this.tipPretplate = tipPretplate;
	}

	@Override
	public String toString() {
		return "Pretplata [id=" + id + ", pocetak=" + pocetak + ", kraj=" + kraj + ", clan=" + clan + ", tipPretplate="
				+ tipPretplate + "]";
	}
	

}
