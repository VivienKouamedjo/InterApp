package fr.ensim.interop.eval.exo1;

import java.util.Date;

public class Avis implements Comparable<Avis> {
	
	private Date dateAvis;
	private String refProd;
	private int note;
	private String commentaire;
	private String refFourn;
	private String country;
	
	public Avis() {
		System.out.println("Avis crée");
	}

	public Date getDateAvis() {
		return dateAvis;
	}

	public void setDateAvis(Date dateAvis) {
		this.dateAvis = dateAvis;
	}

	public String getRefProd() {
		return refProd;
	}

	public void setRefProd(String refProd) {
		if(refProd.length() > 20) {
			throw new IllegalArgumentException();
		}
		this.refProd = refProd;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		if(note<0 || note>10) {
			throw new IllegalArgumentException();
		}
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		if(commentaire.length()>300) {
			throw new IllegalArgumentException();
		}
		this.commentaire = commentaire;
	}

	public String getRefFourn() {
		return refFourn;
	}

	public void setRefFourn(String refFourn) {
		if(refFourn.length() > 15) {
			throw new IllegalArgumentException();
		}
		this.refFourn = refFourn;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int compareTo(Avis o) {
		// TODO Auto-generated method stub
		return (int)(this.getDateAvis().getTime() - o.getDateAvis().getTime());
	}
	
}
