package application;

public class Taille extends Option{
	
	private Integer hauteur;
	private Integer longueur;
	
	public Taille(Integer prix, String libelle, Integer hauteur, Integer longueur) {
		super(prix, libelle);
		this.hauteur = hauteur;
		this.longueur = longueur;
	}

	public Integer getHauteur() {
		return hauteur;
	}

	public void setHauteur(Integer hauteur) {
		this.hauteur = hauteur;
	}

	public Integer getLongueur() {
		return longueur;
	}

	public void setLongueur(Integer longueur) {
		this.longueur = longueur;
	}
}
