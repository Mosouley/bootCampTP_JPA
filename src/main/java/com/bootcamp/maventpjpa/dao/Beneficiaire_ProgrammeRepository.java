
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Beneficiaire_Programme;

/**
 * impl du repository pour la nouvelle classe bene_program
 * @author soul
 */
public class Beneficiaire_ProgrammeRepository extends BaseRepository<Beneficiaire_Programme> {
    
    public Beneficiaire_ProgrammeRepository(String persistUnit) {
        super(persistUnit, Beneficiaire_Programme.class);
    }
    
}
