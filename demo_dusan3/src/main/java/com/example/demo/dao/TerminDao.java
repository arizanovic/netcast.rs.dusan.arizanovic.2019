package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Clan;
import com.example.demo.domain.Termin;
import com.example.demo.domain.Trener;

public interface TerminDao extends CrudRepository<Termin, Long>{

	List<Termin> findByTrener(Trener trener);

	List<Termin> findByClan(Clan clan);

	List<Termin> findByVremInter(Date pocetak, Date kraj);


}
