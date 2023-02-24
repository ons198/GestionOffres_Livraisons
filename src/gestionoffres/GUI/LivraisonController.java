/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.GUI;

import gestionoffres.entities.Livraison;
import gestionoffres.services.LivraisonCRUD;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LivraisonController implements Initializable {

    @FXML
    private TextField tflid_livraison;
    @FXML
    private TextField tfladdresse_liv;
    @FXML
    private TextField tfldestinataire;
    @FXML
    private TextField tflpoids;
    @FXML
    private TextField tflcontenu;
    @FXML
    private TextField tflprix_liv;
    @FXML
    private Button btnAjouterLiv;
    @FXML
    private Button btnModifierLiv;
    @FXML
    private Button btnsuppliv;
    @FXML
    private Button btnAffLiv;
    @FXML
    private ImageView im1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterLivraison(ActionEvent event) {
          try{
            
        int  resid_livraison=Integer.valueOf( tflid_livraison.getText());
        String resaddresse_liv= tfladdresse_liv.getText();
        String resdestinataire=tfldestinataire.getText();
        float respoids=Float.valueOf(tflpoids.getText());
        String rescontenu=tflcontenu.getText();
        float  resprix_liv=Float.valueOf( tflprix_liv.getText());
        
        
        
        LivraisonCRUD ocd= new LivraisonCRUD();
        Livraison l = new Livraison(resid_livraison, resaddresse_liv, resdestinataire,respoids, rescontenu,resprix_liv  );
        ocd.addLivraison(l);
        System.out.println("Done!");
        
        ///redirection
        FXMLLoader loader=new FXMLLoader(getClass().getResource("affliv.fxml"));
         
        Parent root=loader.load();
        AfflivController dc =loader.getController();
        
        dc.setResid_livraison(resid_livraison);
        dc.setResaddresse_liv(resaddresse_liv);
        
        dc.setResdestinataire(resdestinataire);
        dc.setRespoids(respoids);
        
        dc.setRescontenu(rescontenu);
        dc.setResprix_liv (resprix_liv );
        
        tflid_livraison.getScene().setRoot(root);
         
        }catch (IOException ex){
            System.out.println(ex.getMessage());
             //Logger.getLogger(OffreController.class.getId_offre()).log(Level.SEVERE, null, ex);
        }
    }

    public TextField getTflid_livraison() {
        return tflid_livraison;
    }

    public TextField getTfladdresse_liv() {
        return tfladdresse_liv;
    }

    public TextField getTfldestinataire() {
        return tfldestinataire;
    }

    public TextField getTflpoids() {
        return tflpoids;
    }

    public TextField getTflcontenu() {
        return tflcontenu;
    }

    public TextField getTflprix_liv() {
        return tflprix_liv;
    }

    public Button getBtnAjouterLiv() {
        return btnAjouterLiv;
    }

    public void setTflid_livraison(TextField tflid_livraison) {
        this.tflid_livraison = tflid_livraison;
    }

    public void setTfladdresse_liv(TextField tfladdresse_liv) {
        this.tfladdresse_liv = tfladdresse_liv;
    }

    public void setTfldestinataire(TextField tfldestinataire) {
        this.tfldestinataire = tfldestinataire;
    }

    public void setTflpoids(TextField tflpoids) {
        this.tflpoids = tflpoids;
    }

    public void setTflcontenu(TextField tflcontenu) {
        this.tflcontenu = tflcontenu;
    }

    public void setTflprix_liv(TextField tflprix_liv) {
        this.tflprix_liv = tflprix_liv;
    }

    public void setBtnAjouterLiv(Button btnAjouterLiv) {
        this.btnAjouterLiv = btnAjouterLiv;
    }

    @FXML
    private void ModifierLivraison(ActionEvent event) {
        
        
        
         Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setContentText("Livraison a été modifiée avec succès");
        
        alert.showAndWait();
        
        int  resid_livraison=Integer.valueOf( tflid_livraison.getText());
        String resaddresse_liv= tfladdresse_liv.getText();
        String resdestinataire=tfldestinataire.getText();
        float respoids=Float.valueOf(tflpoids.getText());
        String rescontenu=tflcontenu.getText();
        float  resprix_liv=Float.valueOf( tflprix_liv.getText());
        LivraisonCRUD ocd= new LivraisonCRUD();
        Livraison l = new Livraison(resid_livraison, resaddresse_liv, resdestinataire,respoids, rescontenu,resprix_liv  );
        ocd.ModifierLivraison(l);
        System.out.println("Done!");
    }

    @FXML
    private void SupprimerLivraison(ActionEvent event) {
        
        
         Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setContentText("Livraison a été supprimée avec succès");
        
        alert.showAndWait();
        
        int  resid_livraison=Integer.valueOf( tflid_livraison.getText());
        String resaddresse_liv= tfladdresse_liv.getText();
        String resdestinataire=tfldestinataire.getText();
        float respoids=Float.valueOf(tflpoids.getText());
        String rescontenu=tflcontenu.getText();
        float  resprix_liv=Float.valueOf( tflprix_liv.getText());
        LivraisonCRUD ocd= new LivraisonCRUD();
        Livraison l = new Livraison(resid_livraison, resaddresse_liv, resdestinataire,respoids, rescontenu,resprix_liv  );
        ocd.SupprimerLivraison(l);
        System.out.println("Done!");
    }
 
    
    
}
