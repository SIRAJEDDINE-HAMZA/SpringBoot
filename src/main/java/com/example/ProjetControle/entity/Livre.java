package com.example.ProjetControle.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livre")
public class Livre {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false, length = 50)
	private String titre;

	@Column(nullable = false, updatable = false)
	private String maisonedition;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd",shape =JsonFormat.Shape.STRING )
	private Date datesortie ;



	@Column(nullable = false)
	private String auteur;

	@Column(nullable = false)
	private int nbrpage;

	@Column(unique=true, nullable = false, updatable = false)
	private String isbn;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd",shape =JsonFormat.Shape.STRING )
	private Date dateconsu ;

	@Column(nullable = false)
	private boolean dispo;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMaisonedition() {
		return maisonedition;
	}

	public void setMaisonedition(String maisonedition) {
		this.maisonedition = maisonedition;
	}



	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrpage() {
		return nbrpage;
	}

	public void setNbrpage(int nbrpage) {
		this.nbrpage = nbrpage;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Date getDatesortie() {
		return datesortie;
	}

	public void setDatesortie(Date datesortie) {
		this.datesortie = datesortie;
	}

	public Date getDateconsu() {
		return dateconsu;
	}

	public void setDateconsu(Date dateconsu) {
		this.dateconsu = dateconsu;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	
	
	
	
	

}
