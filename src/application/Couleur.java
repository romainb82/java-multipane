package application;

import java.util.HashMap;

public class Couleur extends Option {

	private String couleur;
	private static HashMap<String, Couleur> couleurMap = new HashMap<String, Couleur>();
	
	public Couleur(Integer prix, String libelle, String couleur) {
		super(prix, libelle);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void setCouleurMap(HashMap<String, Couleur> couleur) {
		couleurMap = couleur;
	}
	
	public static HashMap<String, Couleur> getCouleurMap() {
		return couleurMap;
	}
}
