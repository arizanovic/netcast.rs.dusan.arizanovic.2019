package com.example.demo.service.implementation;

import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanUpdateDto;

public interface ClanInt {
	
	//String process(String ime, String prezime,String pol,Integer godine,String email);
	String process(ClanDto clanDto);
	
	String process(ClanUpdateDto clanUpdateDto);
}
