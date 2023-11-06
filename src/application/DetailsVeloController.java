package application;

import java.beans.EventHandler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class DetailsVeloController {

    @FXML
    private Button americain;

    @FXML
    private Button bleu;

    @FXML
    private Label classique;

    @FXML
    private Label colorBrillant;

    @FXML
    private Button commander;

    @FXML
    private Label custom;

    @FXML
    private TextField customPrix;

    @FXML
    private Button francais;

    @FXML
    private ToggleGroup oui;

    @FXML
    private RadioButton persoNon;

    @FXML
    private RadioButton persoOui;

    @FXML
    private TextField persoTexte;

    @FXML
    private TextField prix;

    @FXML
    private TextField prixClassique;

    @FXML
    private Button rouge;

    @FXML
    private Label souhaitPersonnalisation;

    @FXML
    private Label titre;

    @FXML
    private ImageView velo2;
        
    @FXML
    private Button vert;
    
    private int nombreDeClics;

    private String selectedVelo;
    
    private Image selectedImage;
    
    public void setSelectedImage(Image image) {
    	this.selectedImage = image;
    	velo2.setImage(selectedImage);	
    }
    
    public void setSelectedVelo(String veloType) {
    	this.selectedVelo = veloType;
    }
    public void initialize() {
    	prix.setText(Velo.getPrix().toString());
    }
    
    @FXML
	private void onClickFrancais(MouseEvent e) {
    	nombreDeClics++;
        if (nombreDeClics % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair" + Couleur.getCouleurMap());
        }
    }
    
    @FXML
	private void onClickAmericain(MouseEvent e) {
    	System.out.println("coucou");

    }
    
    @FXML
	private void onClickBleu(MouseEvent e) {
    	System.out.println("coucou");

    }
    
    @FXML
	private void onClickVert(MouseEvent e) {
    	System.out.println("coucou");

    }
    
    @FXML
	private void onClickRouge(MouseEvent e) {
    	System.out.println("coucou");

    }
}
