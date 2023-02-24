/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionoffres.interfaces;

import java.util.List;

/**
 *
 * @author user
  
 * @param <T>
  
 */
public interface Entity2CRUD<T>  {
    
    public void addLivraison(T t);
    public void ModifierLivraison(T t);
    //public void SupprimerLivraison(T t);
    public List<T> LivraisonList();
    
}
