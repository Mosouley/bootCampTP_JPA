
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.Programme;

/**
 *
 * @author soul
 * 
 */
public class ProgrammeRepository extends BaseRepository<Programme> {
   
    public ProgrammeRepository(String persistUnit) {
        super(persistUnit,Programme.class);
    }
   
    
}
