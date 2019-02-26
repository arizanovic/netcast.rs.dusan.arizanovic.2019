package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Clan;

@Repository
public interface ClanDao extends CrudRepository<Clan, Long>{

}
