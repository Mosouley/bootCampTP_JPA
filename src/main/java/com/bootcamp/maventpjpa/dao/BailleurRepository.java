
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Bailleur;

/**
 *
 * @author soul
 * 
 */
public class BailleurRepository extends BaseRepository<Bailleur>{
 
    public BailleurRepository(String persistUnit) {
        super(persistUnit,Bailleur.class);
    }
 
    
  
}
