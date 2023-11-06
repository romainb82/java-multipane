package application;

import java.io.IOException;
import java.util.HashMap;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ShowVeloController {
    @FXML
    private ImageView veloCourse;

    @FXML
    private ImageView vtt;

	@FXML
	private void onClickVeloCourse(MouseEvent e) {
		try {
		    HashMap<String, Velo> velo = new HashMap<String, Velo>();
		    HashMap<String, Couleur> couleur = new HashMap<String, Couleur>();
		    HashMap<String, Taille> taille = new HashMap<String, Taille>();

			String urlVelo = "velo-bleu.jepg";
			Velo vtt = new Velo("tout-terrain", "decathlon", urlVelo, 8000);
			// MAP
			velo.put("Velo", vtt);
			
			Couleur veloBleu = new Couleur(100, "bleu", "bleu");
			Couleur veloRouge = new Couleur(200, "rouge", "rouge");
			Couleur veloVert = new Couleur(300, "vert", "vert");
			Couleur veloFrancais = new Couleur(500, "fr", "fr");
			Couleur veloAmericain = new Couleur(50, "usa", "usa");
			// MAP	
			couleur.put("veloBleu", veloBleu);
			couleur.put("veloRouge", veloRouge);
			couleur.put("veloVert", veloVert);
			couleur.put("veloFrancais", veloFrancais);
			couleur.put("veloAmericain", veloAmericain);


			Taille taillePetit = new Taille(75, "petit", 25, 25);
			Taille tailleMoyen = new Taille(75, "moyen", 50, 50);
			Taille tailleGrand = new Taille(75, "grand", 75, 75);
			// MAP
			taille.put("taillePetit", taillePetit);
			taille.put("tailleMoyen", tailleMoyen);
			taille.put("tailleGrand", tailleGrand);

			FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailsVelo.fxml"));
	        Parent vueVeloTt = loader.load();

	        DetailsVeloController detailController = loader.getController();
	        detailController.setSelectedImage(veloCourse.getImage());
	        detailController.setSelectedVelo("tout-terrain");

	        Scene sceneVeloCourse = new Scene(vueVeloTt);
	        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	        stage.setScene(sceneVeloCourse);
	        stage.show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@FXML
	private void onClickVtt(MouseEvent e) {
		try {
		    HashMap<String, Velo> velo = new HashMap<String, Velo>();
		    HashMap<String, Couleur> couleur = new HashMap<String, Couleur>();
		    HashMap<String, Taille> taille = new HashMap<String, Taille>();

			String urlVelo = "VTT.jepg";
			Velo toutTerrain = new Velo("tout-terrain", "decathlon", urlVelo, 10000);
			// MAP
			velo.put("Velo", toutTerrain);
			
			Couleur veloBleu = new Couleur(100, "bleu", "bleu");
			Couleur veloRouge = new Couleur(200, "rouge", "rouge");
			Couleur veloVert = new Couleur(300, "vert", "vert");
			Couleur veloFrancais = new Couleur(500, "fr", "fr");
			Couleur veloAmericain = new Couleur(50, "usa", "usa");
			// MAP	
			couleur.put("veloBleu", veloBleu);
			couleur.put("veloRouge", veloRouge);
			couleur.put("veloVert", veloVert);
			couleur.put("veloFrancais", veloFrancais);
			couleur.put("veloAmericain", veloAmericain);


			Taille taillePetit = new Taille(75, "petit", 25, 25);
			Taille tailleMoyen = new Taille(75, "moyen", 50, 50);
			Taille tailleGrand = new Taille(75, "grand", 75, 75);
			// MAP
			taille.put("taillePetit", taillePetit);
			taille.put("tailleMoyen", tailleMoyen);
			taille.put("tailleGrand", tailleGrand);

			FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailsVelo.fxml"));
	        Parent vueVeloCourse = loader.load();

	        DetailsVeloController detailController = loader.getController();
	        detailController.setSelectedImage(vtt.getImage());
	        detailController.setSelectedVelo("course");

	        Scene sceneVeloCourse = new Scene(vueVeloCourse);
	        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	        stage.setScene(sceneVeloCourse);
	        stage.show();
	        
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
