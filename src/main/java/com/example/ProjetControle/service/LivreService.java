package com.example.ProjetControle.service;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjetControle.entity.Livre;
import com.example.ProjetControle.repository.LivreRepo;


@Service
public class LivreService {

	@Autowired
	   private LivreRepo repository;
	
	 
	   // methode pour ajouter un livre

	public void addLivre(Livre livre) {
		 repository.save(livre);
	    }



	   @OrderBy(value = "Titre ASC")
	   // Retourner tous les livres dans la table livre
		public List<Livre> getLivres(){
			return repository.findAll();
		}


	   // Retourner un livre par  id
	   public Livre getLivreById(Integer id) {
		   return repository.findById(id).orElse(null);
	   }

	  //Supprimer un livre par id
	   public String deleteLivre(Integer id){
		   repository.deleteById(id);
		   return " Le livre ayant l'id : " +id +" a été  supprimé!! ";
	   }

	   public Livre updateLivre(Livre livre){
		   Livre existingLivre=repository.findById(livre.getId()).orElse(null);
		   existingLivre.setTitre(livre.getTitre());
		   existingLivre.setDatesortie(livre.getDatesortie());
		   existingLivre.setAuteur(livre.getAuteur());
		   existingLivre.setNbrpage(livre.getNbrpage());
		   existingLivre.setDateconsu(livre.getDateconsu());
		   existingLivre.setDispo(livre.isDispo());
		   return repository.save(existingLivre);	   
		   		
	   }
}
