
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Livrable;

/**
 *
 * @author soul
 * 
 */
public class LivrableRepository extends BaseRepository<Livrable> {
    
    public LivrableRepository(String persistUnit) {
        super(persistUnit,Livrable.class);
    }
    
}
