
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Projet;

/**
 *
 * @author soul
 * 
 */
public class ProjetRepository extends BaseRepository<Projet> {
    
    public ProjetRepository(String persistUnit) {
        super(persistUnit,Projet.class);
    }
    
}
