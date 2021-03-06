package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.domain.Clan;
import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanTerminDto;
import com.example.demo.domain.dto.ClanUpdateDto;

public interface ClanInt {

	public String process(ClanDto clanDto);
	
	public String process(ClanUpdateDto clanUpdateDto);
	
	public List<Clan> findAll();

	public Clan findById(Long id);
	
	public String deleteById(Long id);

	public ClanTerminDto clanTermin(Long id);

	public Clan save(ClanDto clanDto);

	public Clan update(Clan clan);

	public String delete(Long id);

	public ClanTerminDto terminList(Long clan_id);

	boolean validationEmail(String email);

}
