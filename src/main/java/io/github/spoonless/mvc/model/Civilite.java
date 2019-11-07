package io.github.spoonless.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Civilite {
	
	private static final Civilite MONSIEUR = new Civilite("0", "Monsieur");
	private static final Civilite MADAME = new Civilite("1", "Madame");
	private static final Civilite AUTRE = new Civilite("2", "Autre");

	private String id;
	private String nom;
	
	public static List<Civilite> getCivilites() {
		List<Civilite> civilites = new ArrayList<Civilite>();
		civilites.add(MONSIEUR);
		civilites.add(MADAME);
		civilites.add(AUTRE);
		return civilites;
	}
	
	public static Civilite getCivilite(String id) {
		if (id == null) {
			return null;
		}
		switch (id) {
		case "0":
			return MONSIEUR;
		case "1":
			return MADAME;
		case "2":
			return AUTRE;
		default:
			return null;
		}
	}
	
	public Civilite(String id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}
}
