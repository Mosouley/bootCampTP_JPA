
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Fournisseur_Programme;

/**
 *
 * @author soul
 */
public class Fournisseur_ProgrammeRepository extends BaseRepository<Fournisseur_Programme> {
    
    public Fournisseur_ProgrammeRepository(String persistUnit) {
        super(persistUnit, Fournisseur_Programme.class);
    }
    
}
