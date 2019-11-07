package io.github.spoonless.mvc;

public class DonneesPersonnelles {
	
	private String nom;
	private Integer age;
	
	public DonneesPersonnelles(String nom, String age) throws DonneesInvalidesException {
		if (isBlank(nom) || isBlank(age)) {
			throw new DonneesInvalidesException("Certaines données ne sont pas renseignées !");
		}
		this.nom = nom;
		try {
			this.age = Integer.valueOf(age);
		} catch(NumberFormatException e) {
			throw new DonneesInvalidesException("L'âge n'est pas un nombre !");
		}
	}
	
	private static boolean isBlank(String valeur) {
		return valeur == null || "".equals(valeur);
	}
	
	public String getNom() {
		return nom;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public boolean isMajeur() {
		return age != null && age >= 18;
	}
}
