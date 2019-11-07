package io.github.spoonless.mvc.model;

public class DonneesPersonnelles {
	
	private String nom;
	private Integer age;
	private String email;
	private Civilite civilite;
	
	public DonneesPersonnelles(String civiliteId, String nom, String age, String email) throws DonneesInvalidesException {
		DonneesInvalidesException exception = new DonneesInvalidesException();
		if (isBlank(nom)) {
			exception.addErreur("nom", "Le nom est obligatoire !");
		}
		this.nom = nom;

		if (isBlank(email)) {
			exception.addErreur("email", "L'email est obligatoire !");
		}
		else if (! email.contains("@")) {
			exception.addErreur("email", "L'email n'est pas valide !");
		}
		this.email = email;

		if (isBlank(age)) {
			exception.addErreur("age", "L'âge est obligatoire !");
		} else {
			try {
				this.age = Integer.valueOf(age);
			} catch(NumberFormatException e) {
				exception.addErreur("age", "L'âge doit être un nombre !");
			}
		}

		this.civilite = Civilite.getCivilite(civiliteId);
		if (civilite == null) {
			exception.addErreur("civilite", "La civilite est obligatoire !");
		}
		
		if (exception.isErreursPresentes()) {
			throw exception;
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
	
	public String getEmail() {
		return email;
	}
	
	public Civilite getCivilite() {
		return civilite;
	}
}
