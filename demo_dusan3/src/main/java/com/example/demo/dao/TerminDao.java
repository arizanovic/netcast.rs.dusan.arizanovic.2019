package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Termin;
import com.example.demo.domain.Trener;

public interface TerminDao extends JpaRepository<Termin, Long>{

	List<Termin> findByTrener(Trener trener);
	List<Termin> findByClan(Clan clan);
	List<Termin> findByPocetakBetween(Date pocetak, Date kraj);	
	List<Termin> findByPocetakAfterAndPocetakBefore(Date pocetak, Date kraj);
	
}
