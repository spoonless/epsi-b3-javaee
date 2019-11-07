package io.github.spoonless.mvc.model;

import java.util.HashMap;
import java.util.Map;

public class DonneesInvalidesException extends Exception {
	
	private Map<String, String> erreurs = new HashMap<String, String>();

	public void addErreur(String champ, String msg) {
		erreurs.put(champ, msg);
	}
	
	public boolean isErreursPresentes() {
		return ! erreurs.isEmpty();
	}
	
	public Map<String, String> getErreurs() {
		return erreurs;
	}

}
