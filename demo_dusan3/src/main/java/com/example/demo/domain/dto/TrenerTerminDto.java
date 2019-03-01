package com.example.demo.domain.dto;

import java.util.List;
import com.example.demo.domain.Termin;
import com.example.demo.domain.Trener;

public class TrenerTerminDto {

	private Trener trener;
	private List<Termin> termin;
	
	public TrenerTerminDto() {
		super();
	}

	public TrenerTerminDto(Trener trener, List<Termin> termin) {
		super();
		this.trener = trener;
		this.termin = termin;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}

	public List<Termin> getTermin() {
		return termin;
	}

	public void setTermin(List<Termin> termin) {
		this.termin = termin;
	}
	
	
	
}
