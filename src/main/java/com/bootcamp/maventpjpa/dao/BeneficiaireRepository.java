
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Beneficiaire;

/**
 *
 * @author soul
 * 
 */
public class BeneficiaireRepository extends BaseRepository<Beneficiaire> {
   
    public BeneficiaireRepository(String persistUnit) {
        super(persistUnit,Beneficiaire.class);
    }
   
    
}
