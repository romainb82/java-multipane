package application;

public class Option {
	private static Integer prix;
	private String libelle;
	
	public Option(Integer prix, String libelle) {
		this.prix = prix;
		this.libelle = libelle;
	}

	public static Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
