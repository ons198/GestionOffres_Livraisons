/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LoginOffController implements Initializable {

    @FXML
    private Button btnlog;
    @FXML
    private Button btngerliv;
    @FXML
    private ImageView im22;
    @FXML
    private ImageView im2;
    
     
         


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOffre(ActionEvent event) throws IOException {
    
    
    FXMLLoader loader = new FXMLLoader();
         
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("Offre.fxml"));
         
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
    
}

    @FXML
    private void gérerlivraison(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
         
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("livraison.fxml"));
         
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
        
    }
}
