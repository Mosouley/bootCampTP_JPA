
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.IndicateurQualitatif;

/**
 *
 * @author soul
 * 
 */
public class IndicateurQualitatifRepository extends BaseRepository<IndicateurQualitatif> {
    
    public IndicateurQualitatifRepository(String persistUnit) {
        super(persistUnit,IndicateurQualitatif.class);
    }
    
    
}
