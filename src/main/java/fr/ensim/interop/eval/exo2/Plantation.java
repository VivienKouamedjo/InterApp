package fr.ensim.interop.eval.exo2;

import java.util.Date;

public class Plantation {
	
	private int id;
	private Date datePlantation;
	private String parcelle;
	private String nom_plant;
	private String famille_plan;
	
	
	public Plantation(Date date, String nom, String parcelle, String famille) {
		this.datePlantation = date;
		this.nom_plant = nom;
		this.famille_plan = famille;
		this.parcelle = parcelle;
	}
	//GETTERS SETTERS ID 
	public int getId() {
		return id;
	}
	
	public void setId(int idPl) {
		this.id = idPl;
	}

	//Getters and setters DatePlantation
	public Date getDatePlantation() {
		return datePlantation;
	}

	public void setDatePlantation(Date datePlantation) {
		this.datePlantation = datePlantation;
	}
	
	//Getters and setters parcelle
	public String getParcelle() {
		return parcelle;
	}

	public void setParcelle(String parcelle) {
		this.parcelle = parcelle;
	}

	//Getters and setters nom_plant
	public String getNom_plant() {
		return nom_plant;
	}

	public void setNom_plant(String nom_plant) {
		this.nom_plant = nom_plant;
	}
	
	//Getters and setters FamillePlant
	public String getFamille_plan() {
		return famille_plan;
	}

	public void setFamille_plan(String famille_plan) {
		this.famille_plan = famille_plan;
	}
	
	
	
	
	

}
