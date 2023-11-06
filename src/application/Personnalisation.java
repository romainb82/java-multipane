package application;

public class Personnalisation extends Option {
	private String textePerso;
	
	public Personnalisation(Integer prix, String libelle, String textePerso) {
		super(prix, libelle);
		this.textePerso = textePerso;
	}

	public String getTextePerso() {
		return textePerso;
	}

	public void setTextePerso(String textePerso) {
		this.textePerso = textePerso;
	}
}	
 