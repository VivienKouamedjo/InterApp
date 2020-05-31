package fr.ensim.interop.eval.exo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PlantationRestController {
	// TODO Exercice 2 - Implémentation d'une API REST pour la gestion de plantation
	Map<Integer, Plantation> listPlantation = new HashMap<Integer, Plantation>();
	/*
	 * params : none
	 * Returns Plantations list
	 */
	@GetMapping("/Plantations")
	public ResponseEntity<Map<Integer,Plantation>> getPlantations(){
		//On retourne juste la Map des plantations
		return ResponseEntity.ok(listPlantation);
	}
	
	@DeleteMapping("/Plantations/{id}")
	public ResponseEntity<String> DeleteById(@PathVariable("id") int id){
		
		for(Plantation pl: listPlantation.values()) {
			if(pl.getId() == id ) {
				String Nameplant = pl.getFamille_plan();
				listPlantation.remove(id);
				return ResponseEntity.ok("Equipe "+Nameplant+"Supprimée");
			}
		}
		return ResponseEntity.badRequest().body("La plantation que vous voulez supprimer n\'existe pas ");
	}
	
	@PostMapping("/Equipes")
	public ResponseEntity<Plantation> CreatePlantation(
			@RequestParam(required=true) Date datePl,
			@RequestParam(required=true) String parcelle,
			@RequestParam(required=true) String nomPlant,
			@RequestParam(required=true) String FamPlant){

		for(Plantation pl: listPlantation.values()) {
			if(pl.getParcelle() == parcelle || parcelle =="")
				return ResponseEntity.badRequest().body(null);
		}
		
		Plantation newPlantation = new Plantation(datePl,nomPlant, parcelle, FamPlant);
		newPlantation.setId(listPlantation.size());
		listPlantation.put(newPlantation.getId(), newPlantation);
		return ResponseEntity.ok(newPlantation);
	}
	
}