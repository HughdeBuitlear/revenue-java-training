package com.accenture.tagtrainingspring.screening;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ScreeningDaoImpl implements ScreeningDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Screening getScreening(int patientId) {
        return jdbcTemplate.queryForObject("select * from  screening_results  where id = ?", new Object[]{patientId}, new ScreeningRowMapper());
    }

     
    @Override
    public List<Screening> getScreenings() {
        return jdbcTemplate.query("select * from  screening_results", new ScreeningRowMapper());
    }
    
}