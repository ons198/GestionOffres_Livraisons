/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.GUI;

import gestionoffres.entities.Offre;
import gestionoffres.services.OffreCRUD;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import static java.sql.JDBCType.NULL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author user
 */
public class OffreController implements Initializable {

    @FXML
    private TextField tfid_offre;
    @FXML
    private TextField tfdestination;
    @FXML
    private TextField tfprix;
    @FXML
    private TextField tfid_conducteur;
    @FXML
    private TextField tfpt_depart;
    @FXML
    private TextField tftype_vehicule;
    @FXML
    private Button btncreer;
    @FXML
    private Button btnmodifier;
    @FXML
    private Button btnsupprimer;
    @FXML
    private Button afficheroff;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   

    @FXML
    private void creer_offre(ActionEvent event) {
        
        
       
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setContentText("Offre ajoutée");
        
        alert.showAndWait();
        
        try{
            
        int  resid_offre=Integer.valueOf( tfid_offre.getText());
        int resid_conducteur=Integer.valueOf(tfid_conducteur.getText());
        String resDestination=tfdestination.getText();
        String respt_depart=tfpt_depart.getText();
        float  resPrix=Float.valueOf( tfprix.getText());
        String restype_vehicule=tftype_vehicule.getText();
        
        
        OffreCRUD ocd= new OffreCRUD();
        Offre o = new Offre(resid_offre, resid_conducteur, resDestination,respt_depart, resPrix,restype_vehicule  );
        //if ( resid_offre == 0){
          //  tfid_offre.setText("id_offre non valable. ");
            
        //}
        //if (resid_conducteur== 0){
          //  tfid_conducteur.setText("id_conducteur non valable. ");
            
        //}
        
        //if (resDestination== null){
          //  tfdestination.setText("tfdestination non valable. ");
            
        //}
        //if (respt_depart==null){
          //  tfpt_depart.setText("Email non valable. ");
            
        //}
        //if (resPrix==0){
          //  tfprix.setText("Nom non valable. ");
             
        //}
        //if (restype_vehicule==null){
          //  tftype_vehicule.setText("Prenom non valable. ");
             
        //}
         
         
         
        ocd.addEntity(o);
        System.out.println("Done!");
        
        ///redirection
        FXMLLoader loader=new FXMLLoader(getClass().getResource("Detail.fxml"));
         
        Parent root=loader.load();
        DetailController dc =loader.getController();
        
        dc.setResid_offre(resid_offre);
        dc.setResid_conducteur(resid_conducteur);
        
        dc.setResDestination(resDestination);
        dc.setRespt_depart(respt_depart);
        
        dc.setResPrix(resPrix);
        dc.setRestype_vehicule(restype_vehicule);
        
        tfid_offre.getScene().setRoot(root);
         
        }catch (IOException ex){
            System.out.println(ex.getMessage());
             //Logger.getLogger(OffreController.class.getId_offre()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
 
    
    @FXML
    private void Modifier(ActionEvent event) throws NoSuchAlgorithmException {
        
         Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setContentText("Offre a été modifiée avec succès");
        
        alert.showAndWait();
        
        try{
            
        int  resid_offre=Integer.valueOf( tfid_offre.getText());
        int resid_conducteur=Integer.valueOf(tfid_conducteur.getText());
        String resDestination=tfdestination.getText();
        String respt_depart=tfpt_depart.getText();
        float  resPrix=Float.valueOf( tfprix.getText());
        String restype_vehicule=tftype_vehicule.getText();
        
        
        OffreCRUD ocd= new OffreCRUD();
        Offre o = new Offre(resid_offre, resid_conducteur, resDestination,respt_depart, resPrix,restype_vehicule  );
        ocd.ModifierOff(o);
        System.out.println("Done!");
        
        ///redirection
        FXMLLoader loader = new FXMLLoader();
         
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("Detail.fxml"));
         
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
         
        }catch (IOException ex){
            System.out.println(ex.getMessage());
             //Logger.getLogger(OffreController.class.getId_offre()).log(Level.SEVERE, null, ex);
        }
       // Offre o = new Offre();
        //o.setId_offre(Integer.getInteger(tfid_offre.getText()));
       //o.setId_conducteur(Integer.getInteger(tfid_conducteur.getText()));
        //o.setDestination(tfdestination.getText());
        //o.setPt_depart(tfpt_depart.getText());
        //o.setPrix(Float.valueOf( tfprix.getText()));
        //o.setType_vehicule(tftype_vehicule.getText());
         
  
        //OffreCRUD offcrd = new OffreCRUD();
        //offcrd. ModifierOff(o );
        //Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //alert.setTitle("Success");
        //alert.setHeaderText(null);
        //alert.setContentText("!!! Modification avec success !!!");
        //alert.showAndWait();
    }

    @FXML
    private void SuppOffre(ActionEvent event) {
    
    
     Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Notification");
      alert.setHeaderText("Vous voulez vraiment supprimer votre offre ?");
      alert.setContentText(null);
        
        try{
            
        int  resid_offre=Integer.valueOf( tfid_offre.getText());
        int resid_conducteur=Integer.valueOf(tfid_conducteur.getText());
        String resDestination=tfdestination.getText();
        String respt_depart=tfpt_depart.getText();
        float  resPrix=Float.valueOf( tfprix.getText());
        String restype_vehicule=tftype_vehicule.getText();
        
        
        OffreCRUD ocd= new OffreCRUD();
        Offre o = new Offre(resid_offre, resid_conducteur, resDestination,respt_depart, resPrix,restype_vehicule  );
        ocd.SupprimerOff(o);
        System.out.println("Done!");
        
        ///redirection
        FXMLLoader loader = new FXMLLoader();
         
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("Detail.fxml"));
         
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
         
        }catch (IOException ex){
            System.out.println(ex.getMessage());
             //Logger.getLogger(OffreController.class.getId_offre()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void afficherOff(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
         
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("Detail.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
    }
}
    

