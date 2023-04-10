package com.samar.voitures.entities;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Marque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMarque;
	private String nomMarque;
	private String descriptionMarque;
	
	@OneToMany(mappedBy = "marque")
	private List<Voiture> Voitures;

	public Long getIdMarque() {
		return idMarque;
	}

	public void setIdMarque(Long idMarque) {
		this.idMarque = idMarque;
	}

	public String getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public String getDescriptionMarque() {
		return descriptionMarque;
	}

	public void setDescriptionMarque(String descriptionMarque) {
		this.descriptionMarque = descriptionMarque;
	}

	public List<Voiture> getVoitures() {
		return Voitures;
	}

	public void setVoitures(List<Voiture> voitures) {
		Voitures = voitures;
	}

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marque(Long idMarque, String nomMarque, String descriptionMarque, List<Voiture> voitures) {
		super();
		this.idMarque = idMarque;
		this.nomMarque = nomMarque;
		this.descriptionMarque = descriptionMarque;
		Voitures = voitures;
	}

	@Override
	public String toString() {
		return "Marque [idMarque=" + idMarque + ", nomMarque=" + nomMarque + ", descriptionMarque=" + descriptionMarque
				+ ", Voitures=" + Voitures + "]";
	}

	
}
