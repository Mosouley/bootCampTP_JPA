
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Bailleur_Programme;

/**
 *
 * @author soul
 */
public class Bailleur_ProgrammeRepository extends BaseRepository<Bailleur_Programme>{
    
    public Bailleur_ProgrammeRepository(String persistUnit) {
        super(persistUnit, Bailleur_Programme.class);
    }
    
}
