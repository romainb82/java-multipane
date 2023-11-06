package application;

public class Velo {
	private String type;
	private String marque;
	private String lienPhoto;
	private static Integer prixVelo;

	public Velo(String type, String marque, String lienPhoto, Integer prixVelo) {
		this.type = type;
		this.marque = marque;
		this.lienPhoto = lienPhoto;
		this.prixVelo = prixVelo;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getLienPhoto() {
		return lienPhoto;
	}

	public void setLienPhoto(String lienPhoto) {
		this.lienPhoto = lienPhoto;
	}
	
	public static Integer getPrix() {
		return prixVelo;
	}

	
}
