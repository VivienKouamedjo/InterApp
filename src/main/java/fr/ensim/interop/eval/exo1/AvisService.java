package fr.ensim.interop.eval.exo1;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import jakarta.jws.WebMethod;

public class AvisService {

	// TODO Exercice 1 - Implémentation d’un Web Service SOAP d’avis consommateur
	public static Map<Integer,Avis> listAvis = new HashMap<Integer,Avis>();
	
	@WebMethod
	public int enregistrerAvis(Date dateAv, String refprod, int note, String comm,String prov, String refFour )  {
		System.out.println("Enregistrement d\'un avis ");
		int AvisNumber = 0;
		Avis nouvelAvis = new Avis();
		nouvelAvis.setCommentaire(comm);
		nouvelAvis.setDateAvis(dateAv);
		nouvelAvis.setCountry(prov);
		nouvelAvis.setNote(note);
		nouvelAvis.setRefProd(refprod);
		nouvelAvis.setRefFourn(refFour);
		for(Avis avis: listAvis.values()) {
			if(avis.getRefFourn() == refFour) {
				AvisNumber++;
			}
		}
		return AvisNumber;
	}
	
	@WebMethod
	public Collection<Avis> listerAvis(){
		TreeMap<Integer, Avis> sortedAvis = new TreeMap<>(listAvis);
		System.out.println("Liste triée des avis ");
		return sortedAvis.values();
	}

}