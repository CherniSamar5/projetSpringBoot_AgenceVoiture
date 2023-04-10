package com.samar.voitures.entities;
import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String modeleVoiture;
	private Double prixVoiture;
	private Date dateFabrication;
	
	@ManyToOne
    private Marque marque;
    

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Voiture( String modeleVoiture, Double prixVoiture, Date dateFabrication) {
		super();
		this.modeleVoiture = modeleVoiture;
		this.prixVoiture = prixVoiture;
		this.dateFabrication = dateFabrication;
	}
	
	public Long getIdVoiture() {
		return idVoiture;
	}
	
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	
	public String getModeleVoiture() {
		return modeleVoiture;
	}
	
	public void setModeleVoiture(String modeleVoiture) {
		this.modeleVoiture = modeleVoiture;
	}
	
	public Double getPrixVoiture() {
		return prixVoiture;
	}
	
	public void setPrixVoiture(Double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}
	
	public Date getDateFabrication() {
		return dateFabrication;
	}
	
	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
	
	public Marque getMarque() {
		return marque;
	}
	
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", modeleVoiture=" + modeleVoiture + ", prixVoiture=" + prixVoiture
				+ ", dateFabrication=" + dateFabrication + ", marque=" + marque + "]";
	}
	
	
	
	
	

}
