package com.example.demo.domain.dto;

import java.util.List;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Termin;

public class ClanTerminDto {

	private Clan clan;	
	private List<Termin> termin;
	
	public ClanTerminDto() {
		super();
	}
	
	public ClanTerminDto(Clan clan, List<Termin> termin) {
		super();
		this.clan = clan;
		this.termin = termin;
	}
	
	public Clan getClan() {
		return clan;
	}
	
	public void setClan(Clan clan) {
		this.clan = clan;
	}
	
	public List<Termin> getTermin() {
		return termin;
	}
	
	public void setTermin(List<Termin> termin) {
		this.termin = termin;
	}
	
	
}
