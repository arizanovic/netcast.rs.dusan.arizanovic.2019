package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.ClanDao;
import com.example.demo.dao.KorisnikDao;
import com.example.demo.dao.TerminDao;
import com.example.demo.dao.TrenerDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Korisnik;
import com.example.demo.domain.Termin;
import com.example.demo.domain.Trener;
import com.example.demo.domain.dto.TerminDto;
import com.example.demo.domain.dto.VremInterDto;
import com.example.demo.service.implementation.TerminInt;

@Service
public class TerminService implements TerminInt{

	@Autowired
	private TerminDao terminDao;
	
	@Autowired
	private ClanDao clanDao;
	
	@Autowired
	private KorisnikDao korisnikDao;
	
	@Autowired
	private TrenerDao trenerDao;

	@Override
	public String process(TerminDto terminDto) {
		Termin t = new Termin(); 
		t.setPocetak(terminDto.getPocetak());
		t.setKraj(terminDto.getKraj());
		t.setClan(terminDto.getClan());
		t.setTrener(terminDto.getTrener());
		terminDao.save(t); 
		return "added";
	}
	
	@Override
	public String process1(TerminDto terminDto) {
		Termin t = new Termin(); 
		t.setId(terminDto.getId());
		t.setPocetak(terminDto.getPocetak());
		t.setKraj(terminDto.getKraj());
		t.setClan(terminDto.getClan());
		t.setTrener(terminDto.getTrener());
		terminDao.save(t); 
		return "updated";
	}
	
	@Override
	public List<Termin> findAll() {	
		return (List<Termin>) terminDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		terminDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Termin findById(Long id) {
		Optional<Termin> termin = terminDao.findById(id);
		if(termin.isPresent()){
			return termin.get();}
		else {
		return null;
		}
	}

	@Override
//	@Transactional
	public List<Termin> findByVremInter(VremInterDto vremInterDto) {
		List<Termin> between = terminDao.findByPocetakAfterAndPocetakBefore(vremInterDto.getPocetak(), vremInterDto.getKraj());
		System.out.println(between.size());
		return between;
}
	/*
	@Override
	@Transactional
	public String save(TerminDto terminDto) {
		Optional<Clan> optionalClan = clanDao.findById(terminDto.getClan().getId());
		Optional<Korisnik> optionalKorisnik = korisnikDao.findById(terminDto.getKorisnik().getId());
		if(optionalClan.isPresent() && optionalKorisnik.isPresent()) {
			Clan clan = optionalClan.get();
			Korisnik korisnik = optionalKorisnik.get();
			Termin termin = new Termin();
			termin.setDatum(terminDto.getDatum());
			termin.setPocetak(terminDto.getPocetak());
			termin.setKraj(terminDto.getKraj());
			termin.setClan(clan);
			termin.setKorisnik(korisnik);
			
			if(clan.getPretplata().getTipPretplate().getTip().equals("Daily") && terminDto.getTrener().getId()!=null) 
			{	Optional<Trener> optionalTrener = trenerDao.findById(terminDto.getTrener().getId());
				Trener trener = optionalTrener.get();
				trener.setBrojTreninga(trener.getBrojTreninga()+1);
				if(clan.getSnizenje()!=null) {
					termin.setCena(clan.getPretplata().getTipPretplate().getCena()*clan.getSnizenje().getSnizenje()+trener.getCena()*clan.getSnizenje().getSnizenje());
					termin.setTrener(trener);
					terminDao.save(termin);
				}else {
					termin.setCena(clan.getPretplata().getTipPretplate().getCena()+trener.getCena());
					termin.setTrener(trener);
					terminDao.save(termin);
				}
								 
				if(trener.getBrojTreninga()%10==0) {
					double trenutnaCena = trener.getCena();
					trener.setCena(trenutnaCena*0.10+trenutnaCena);
					trenerService.update(trener);
				}			
			}
			
			else if(clan.getPretplata().getTipPretplate().getTip().equals("Daily") && terminDto.getTrener().getId()==null)
			{	if(clan.getSnizenje()!=null) {
					termin.setCena(clan.getPretplata().getTipPretplate().getCena()*clan.getSnizenje().getSnizenje());
					terminDao.save(termin);
				}else {
					termin.setCena(clan.getPretplata().getTipPretplate().getCena());
					terminDao.save(termin);
				}	
			}
			
			else if(clan.getPretplata().getTipPretplate().getTip().equals("Monthly") && terminDto.getTrener().getId()!=null) { 
				Optional<Trener> optionalTrener = trenerDao.findById(terminDto.getTrener().getId());
				Trener trener = optionalTrener.get();
				trener.setBrojTreninga(trener.getBrojTreninga()+1);
				if(clan.getSnizenje()!=null) {
					termin.setCena(trener.getCena()*clan.getSnizenje().getSnizenje());
					termin.setTrener(trener);
					terminDao.save(termin);
				}else {
					termin.setCena(trener.getCena());
					termin.setTrener(trener);
					terminDao.save(termin);
					
				}
				
				if(trener.getBrojTreninga()%10==0) {	
					double trenutnaCena = trener.getCena();
					trener.setCena(trenutnaCena*0.10+trenutnaCena);
					trenerService.update(trener);
				}				
			}
				
			else {
				termin.setCena(0.0);
				terminDao.save(termin);
			}	
		}
		if(optionalClan.isPresent()) {
			return "Termin saved!!!";
		}
		return "Nepoznat clan - id!!!";
	}*/

	@Override
	public String save(TerminDto terminDto) {
		
		return null;
	}
	
}