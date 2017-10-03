
package com.bootcamp.maventpjpa.dao;

import com.bootcamp.maventpjpa.entities.IndicateurPerformance;


/**
 *
 * @author soul
 * implementation du repository de base
 */
public class IndicateurPerformanceRepository extends BaseRepository<IndicateurPerformance>{
    
    public IndicateurPerformanceRepository(String persistUnit) {
        super(persistUnit,IndicateurPerformance.class);
    }
    
}
