package com.example.demo.service;

import com.example.demo.domain.dto.ClanDto;

public interface ClanService {

	
	//String process(String ime, String prezime,String pol,Integer godine,String email);
	String process(ClanDto clanDto);
}
