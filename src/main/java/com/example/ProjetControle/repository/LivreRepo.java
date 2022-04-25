package com.example.ProjetControle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProjetControle.entity.Livre;


@Repository
public interface LivreRepo  extends JpaRepository<Livre, Integer>{
	

}
