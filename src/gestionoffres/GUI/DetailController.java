/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.GUI;

import gestionoffres.entities.Offre;
import gestionoffres.services.OffreCRUD;
import static java.awt.SystemColor.control;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class DetailController implements Initializable {

    @FXML
    private TextField restype_vehicule;
    @FXML
    private TextField resid_offre;
    @FXML
    private TextField resid_conducteur;
    @FXML
    private TextField resDestination;
    @FXML
    private TextField respt_depart;
    @FXML
    private TextField resPrix;
    @FXML
    private TableView<Offre> tab_offre;
    @FXML
    private TableColumn<Offre, Integer> colid_offre;
    @FXML
    private TableColumn<Offre, Integer> colid_conducteur;
    @FXML
    private TableColumn<Offre, String> coldestination;
    @FXML
    private TableColumn<Offre, String> colpt_depart;
    @FXML
    private TableColumn<Offre, Float> colPrix;
    @FXML
    private TableColumn<Offre, String> coltype_vehicule;

    Connection con; 
    Statement stm;
    ResultSet rs;
    String str = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url=  "jdbc:sqlserver://localhost:1433; database = JTest; user=Max;";
    String sqlSel ="Select * From Offre";
    ObservableList<Offre> offList= FXCollections.observableArrayList(); 
     
    //"jdbc:sqlserver://localhost:1433; database = JTest; user=Max;"
    @FXML
    private Button retourner;
     

    public TextField getResid_offre() {
        return resid_offre;
    }

    public TextField getResid_conducteur() {
        return resid_conducteur;
    }

    public TextField getResDestination() {
        return resDestination;
    }

    public TextField getRespt_depart() {
        return respt_depart;
    }

    public TextField getResPrix() {
        return resPrix;
    }

    public TextField getRestype_vehicule() {
        return restype_vehicule;
    }

     

    public void setResid_offre(Integer message) {
      
         resid_offre.setText(Integer.toString(message));
                 
    }

    public void setResid_conducteur(Integer message) {
        //this.resid_conducteur = resid_conducteur.getText();
        resid_conducteur.setText(Integer.toString(message));
    }

    public void setResDestination(String message) {
        this.resDestination.setText(message);
    }

    public void setRespt_depart(String respt_depart) {
        this.respt_depart.setText(respt_depart);
    }

    public void setResPrix(float message) {
         resPrix.setText(Float.toString(message));
    }

    public void setRestype_vehicule(String restype_vehicule) {
        this.restype_vehicule.setText(restype_vehicule);
    }
    
    
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Offre> prds = FXCollections.observableArrayList();
         List<Offre> listeOff = new ArrayList<Offre>();
		if (!listeOff.isEmpty()) {
			for (int i = 0; i < listeOff.size(); i++) {
				prds.add(listeOff.get(i));
			}
		}
        
        
        
            colid_offre.setCellValueFactory(new PropertyValueFactory<Offre, Integer>("id_offre"));
            colid_conducteur.setCellValueFactory(new PropertyValueFactory<Offre, Integer>("id_conducteur"));
            coldestination.setCellValueFactory(new PropertyValueFactory<Offre, String >("destination"));
            colpt_depart.setCellValueFactory(new PropertyValueFactory<Offre, String >("pt_depart"));
            colPrix.setCellValueFactory(new PropertyValueFactory<Offre, Float >("prix"));
            coltype_vehicule.setCellValueFactory(new PropertyValueFactory<Offre,String  >("coltype_vehicule"));
        tab_offre.setItems(prds);
    }    

    public TableView<Offre> getTab_offre() {
        return tab_offre;
    }

    public TableColumn<Offre, Integer> getColid_offre() {
        return colid_offre;
    }

    public TableColumn<Offre, Integer> getColid_conducteur() {
        return colid_conducteur;
    }

    public TableColumn<Offre, String> getColdestination() {
        return coldestination;
    }

    public TableColumn<Offre, String> getColpt_depart() {
        return colpt_depart;
    }

    public TableColumn<Offre, Float> getColPrix() {
        return colPrix;
    }

    public TableColumn<Offre, String> getColtype_vehicule() {
        return coltype_vehicule;
    }

    public void setTab_offre(TableView<Offre> tab_offre) {
        this.tab_offre = tab_offre;
    }

    public void setColid_offre(TableColumn<Offre, Integer> colid_offre) {
        this.colid_offre = colid_offre;
    }

    public void setColid_conducteur(TableColumn<Offre, Integer> colid_conducteur) {
        this.colid_conducteur = colid_conducteur;
    }

    public void setColdestination(TableColumn<Offre, String> coldestination) {
        this.coldestination = coldestination;
    }

    public void setColpt_depart(TableColumn<Offre, String> colpt_depart) {
        this.colpt_depart = colpt_depart;
    }

    public void setColPrix(TableColumn<Offre, Float> colPrix) {
        this.colPrix = colPrix;
    }

    //private void modoff(ActionEvent event) {
        
        //int  tfid_offre=Integer.valueOf( resid_offre.getText());
        //int tfid_conducteur=Integer.valueOf(resid_conducteur.getText());
        //String tfdestination=resDestination.getText();
        //String tfpt_depart=respt_depart.getText();
        //float  tfprix=Float.valueOf( resPrix.getText());
        //String tftype_vehicule=restype_vehicule.getText();
        
        //OffreCRUD ocd= new OffreCRUD();
        //Offre o = new Offre(resid_offre , resid_conducteur, resDestination,respt_depart, resPrix,restype_vehicule  );
        //ocd.ModifierOff(o);
        //System.out.println("Done!");
        
          
             //Logger.getLogger(OffreController.class.getId_offre()).log(Level.SEVERE, null, ex);
    
//}

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
    
        //rs = sqlCon(sqlSel);
        //try{
          //  rs.next();
            //resid_offre.setText(Integer.toString(rs.getInt(1)));
            //resid_conducteur.setText(Integer.toString(rs.getInt(2)));
            //resDestination.setText(rs.getString(3));
             //respt_depart.setText(rs.getString(4));
             //resPrix.setText(Float.toString(rs.getFloat(5)));
             //restype_vehicule.setText(rs.getString(6));
             
            //colid_offre.setCellValueFactory(new PropertyValueFactory<Offre, Integer>("id_offre"));
            //colid_conducteur.setCellValueFactory(new PropertyValueFactory<Offre, Integer>("id_conducteur"));
            //coldestination.setCellValueFactory(new PropertyValueFactory<Offre, String >("destination"));
            //colpt_depart.setCellValueFactory(new PropertyValueFactory<Offre, String >("pt_depart"));
            //colPrix.setCellValueFactory(new PropertyValueFactory<Offre, Float >("prix"));
            //coltype_vehicule.setCellValueFactory(new PropertyValueFactory<Offre,String  >("coltype_vehicule"));
        //}catch (SQLException ex){
          //  JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
        
        
        //Offre o=new Offre();
        //ArrayList<Offre>  listoff=FXCollections.observableArrayList(o.getArrayList());

        //colid_offre.setCellValueFactory(new PropertyValueFactory<>("id_offre"));
        //colid_conducteur.setCellValueFactory(new PropertyValueFactory<>("id_conducteur"));
        //coldestination.setCellValueFactory(new PropertyValueFactory< >("destination"));
        //colpt_depart.setCellValueFactory(new PropertyValueFactory< >("pt_depart"));
        //colPrix.setCellValueFactory(new PropertyValueFactory< >("prix"));
        //coltype_vehicule.setCellValueFactory(new PropertyValueFactory< >("coltype_vehicule"));

        //this.listoff.setItems(listoff);
        // TODO
        

     
    
    

