package com.example.demo.service.implementation;

import com.example.demo.domain.dto.ClanDto;
import com.example.demo.domain.dto.ClanUpdateDto;

public interface ClanInt {

	String process(ClanDto clanDto);
	
	String process(ClanUpdateDto clanUpdateDto);
}
