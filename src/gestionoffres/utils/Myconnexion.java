/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Myconnexion {
    
    private String url="jdbc:mysql://localhost:3306/gestion_des_offres";
    private String login="root";
    private String pwd="";
    private Connection cnx;
    private static Myconnexion instance; 

    public Myconnexion() {
        try{
        cnx =(Connection) DriverManager.getConnection(url,login, pwd);
         System.out.println("Connexion etablie!");
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getCnx() {
        return cnx;
    }

    public static Myconnexion getInstance() {
        if (instance == null ){
            instance = new Myconnexion();
        }
        return instance; 
    }
    
    
    
    
}
