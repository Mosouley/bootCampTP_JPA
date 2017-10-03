
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Fournisseur;

/**
 *
 * @author soul
 * 
 */
public class FournisseurRepository extends BaseRepository<Fournisseur> {


    public FournisseurRepository(String persistUnit) {
        super(persistUnit,Fournisseur.class);
    }
    
   
    
}
