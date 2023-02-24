/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.GUI;

import gestionoffres.entities.Livraison;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AfflivController implements Initializable {

    @FXML
    private TextField resid_livraison;
    @FXML
    private TextField resaddresse_liv;
    @FXML
    private TextField resdestinataire;
    @FXML
    private TextField respoids;
    @FXML
    private TextField rescontenu;
    @FXML
    private TextField resprix_liv;
    @FXML
    private TableView<Livraison> table_livraison;
    @FXML
    private TableColumn<Livraison, Integer> colid_livraison;
    @FXML
    private TableColumn<Livraison, String> coladdresse_liv;
    @FXML
    private TableColumn<Livraison, String> coldestinataire;
    @FXML
    private TableColumn<Livraison, Float> colpoids;
    @FXML
    private TableColumn<Livraison, String> colcontenu;
    @FXML
    private TableColumn<Livraison, Float> colprix_liv;
    @FXML
    private Button btnretour2;

    public TextField getResid_livraison() {
        return resid_livraison;
    }

    public TextField getResaddresse_liv() {
        return resaddresse_liv;
    }

    public TextField getResdestinataire() {
        return resdestinataire;
    }

    public TextField getRespoids() {
        return respoids;
    }

    public TextField getRescontenu() {
        return rescontenu;
    }

    public TextField getResprix_liv() {
        return resprix_liv;
    }

    public void setResid_livraison(Integer message) {
        resid_livraison.setText(Integer.toString(message));
    }

    public void setResaddresse_liv(String message) {
           this.resaddresse_liv.setText(message);
    }

    public void setResdestinataire(String message) {
        this.resdestinataire.setText(message);
    }

    public void setRespoids(float message) {
        respoids.setText(Float.toString(message));
    }

    public void setRescontenu(String message) {
         this.rescontenu.setText(message);
    }

    public void setResprix_liv(float message) {
      resprix_liv.setText(Float.toString(message));
    }

    public TableView<Livraison> getTable_livraison() {
        return table_livraison;
    }

    public void setTable_livraison(TableView<Livraison> table_livraison) {
        this.table_livraison = table_livraison;
    }

    public TableColumn<Livraison, Integer> getColid_livraison() {
        return colid_livraison;
    }

    public void setColid_livraison(TableColumn<Livraison, Integer> colid_livraison) {
        this.colid_livraison = colid_livraison;
    }

    public TableColumn<Livraison, String> getColaddresse_liv() {
        return coladdresse_liv;
    }

    public void setColaddresse_liv(TableColumn<Livraison, String> coladdresse_liv) {
        this.coladdresse_liv = coladdresse_liv;
    }

    public TableColumn<Livraison, String> getColdestinataire() {
        return coldestinataire;
    }

    public void setColdestinataire(TableColumn<Livraison, String> coldestinataire) {
        this.coldestinataire = coldestinataire;
    }

    public TableColumn<Livraison, Float> getColpoids() {
        return colpoids;
    }

    public void setColpoids(TableColumn<Livraison, Float> colpoids) {
        this.colpoids = colpoids;
    }

    public TableColumn<Livraison, String> getColcontenu() {
        return colcontenu;
    }

    public void setColcontenu(TableColumn<Livraison, String> colcontenu) {
        this.colcontenu = colcontenu;
    }

    public TableColumn<Livraison, Float> getColprix_liv() {
        return colprix_liv;
    }

    public void setColprix_liv(TableColumn<Livraison, Float> colprix_liv) {
        this.colprix_liv = colprix_liv;
    }
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        // TODO
    }    

    @FXML
    private void retourner(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
         
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("Offre.fxml"));
         
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
    }
    
    
    
}
