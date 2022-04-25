package com.example.ProjetControle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.ParseException;

import com.example.ProjetControle.entity.Livre;
import com.example.ProjetControle.service.LivreService;



@RestController
@RequestMapping(path="/emsi_api")
public class LivreController {
	@Autowired
	private LivreService service;


	@PostMapping("/addLivre")
	public String add(@RequestBody Livre livre)  throws ParseException {
	    service.addLivre(livre);
	    return "Livre ajouté";
	}
	@GetMapping("/livres")
	public List<Livre> findAllLivres(){
		return service.getLivres();
	}

	@GetMapping("/livre/{id}")
	public Livre findLivreById(@PathVariable Integer id) {
		return service.getLivreById(id);
	}

	@PutMapping("/update")
	public Livre updateLivre(@RequestBody Livre livre) {
		return service.updateLivre(livre);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteLivre(@PathVariable Integer id) {
		return service.deleteLivre(id);
	}
}
