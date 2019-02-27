package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.domain.Trener;
import com.example.demo.domain.dto.TrenerDto;

public interface TrenerInt {

	public String process(TrenerDto trenerDto);

	public String process1(TrenerDto trenerDto);

	public List<Trener> findAll();

	public String deleteById(Long id);

	public Trener findById(Long id);

}
