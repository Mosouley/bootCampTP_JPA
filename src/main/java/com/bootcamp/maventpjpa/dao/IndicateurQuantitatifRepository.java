
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.IndicateurQuantitatif;

/**
 *
 * @author soul
 * 
 */
public class IndicateurQuantitatifRepository extends BaseRepository<IndicateurQuantitatif>{
    
//     }

    public IndicateurQuantitatifRepository(String persistUnit) {
        super(persistUnit,IndicateurQuantitatif.class);
    }
    
//     }
    
}
