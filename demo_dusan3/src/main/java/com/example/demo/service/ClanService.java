package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.ClanDao;
import com.example.demo.dao.TerminDao;
import com.example.demo.domain.Clan;
import com.example.demo.domain.Termin;
import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanTerminDto;
import com.example.demo.domain.dto.ClanUpdateDto;
import com.example.demo.service.implementation.ClanInt;

@Service
public class ClanService implements ClanInt{

	ClanDao clanDao;
	TerminDao terminDao;
	
	@Autowired
	public ClanService(ClanDao clanDao, TerminDao terminDao) {
		super();
		this.clanDao = clanDao;
		this.terminDao = terminDao;
	}

	@Override
	public String process(ClanDto clanDto) {
		Clan c = new Clan(); 
		c.setIme(clanDto.getIme());
		 c.setPrezime(clanDto.getPrezime()); 
		 c.setPol(clanDto.getPol()); 
		 c.setGodine(clanDto.getGodine());
		 c.setEmail(clanDto.getEmail());
		 clanDao.save(c); 
		 return "Uspeo";
	}

	@Override
	public String process(ClanUpdateDto clanUpdateDto) {
		Clan c = new Clan(); 
		c.setId(clanUpdateDto.getId());
		c.setIme(clanUpdateDto.getIme());
		 c.setPrezime(clanUpdateDto.getPrezime()); 
		 c.setPol(clanUpdateDto.getPol()); 
		 c.setGodine(clanUpdateDto.getGodine());
		 c.setEmail(clanUpdateDto.getEmail());
		 clanDao.save(c); 
		 return "Updated";
	}
	

	@Override
	public List<Clan> findAll() {	
		return (List<Clan>) clanDao.findAll();
	}
	
	@Override
	public String deleteById(Long id) {
		clanDao.deleteById(id);
		return "deleted";
	}

	@Override
	public Clan findById(Long id) {
		Optional<Clan> clan = clanDao.findById(id);
		if(clan.isPresent()) {
			return clan.get();
		}else{
			return null;
		}
	}

	@Override
	@Transactional
	public ClanTerminDto clanTermin(Long id) {
		Optional<Clan> optionalClan = clanDao.findById(id);
		if(optionalClan.isPresent()) {
			Clan clan = optionalClan.get();
			List<Termin> termin=terminDao.findByClan(clan);
			ClanTerminDto clanTermin = new ClanTerminDto();
			clanTermin.setClan(clan);
			clanTermin.setTermin(termin);
			return clanTermin;
		}
		return null;
		
	
	}
	
	@Override
	public Clan save(ClanDto clanDto) {
		Clan clan=new Clan();
		clan.setIme(clanDto.getIme());
		clan.setPrezime(clanDto.getPrezime());
		clan.setEmail(clanDto.getEmail());
		clan.setPretplata(clanDto.getPretplata());
		if(clanDto.getSnizenje() != null) {
			clan.setSnizenje(clanDto.getSnizenje());
		}	
		if(validationEmail(clanDto.getEmail())) {
			clanDao.save(clan);			
		}else {
			throw new IllegalArgumentException("Uneli ste pogresan email");
		}	
		return clan;
	}

	@Override
	public Clan update(Clan clan) {	
		return clanDao.save(clan);
	}
	
	@Override
	public String delete(Long id) {
		clanDao.deleteById(id);
		return "Obrisano!";
	}
/*
	@Override
	@Transactional
	public ClanTerminDto terminList(Long id) {
		Optional<Clan> optionalClan = clanDao.findById(id);
		if(optionalClan.isPresent()) {
			Clan clan = optionalClan.get();
			List<Termin> termin = terminDao.findByClan(clan);
			ClanTerminDto clanTermin = new ClanTerminDto();
			clanTermin.setId(clanTermin.getClan().getId());
			clanTermin.setIme(clan.getIme());
			clanTermin.setPrezime(clan.getPrezime());
			clanTermin.setTipPretplate(clan.getPretplata().getTipPretplate());
			clanTermin.setTermin(termin);
			return clanTermin;
		}
		return null;
	}
*/
	@Override
	public boolean validationEmail(String email) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPattern.matcher(email);
		return matcher.find();
	}

	@Override
	public ClanTerminDto terminList(Long clan_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
