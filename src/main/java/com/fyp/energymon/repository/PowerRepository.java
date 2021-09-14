package com.fyp.energymon.repository;

import com.fyp.energymon.model.Power;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Repository
public class PowerRepository {
    private final JdbcTemplate jdbcTemplate;

    public PowerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(Power power) {
        final String insertQuery = "INSERT INTO `fyp`.`power` " +
                "(`timestamp`, `rms_voltage`, `rms_current`, `apparent_power`, `real_power`, `power_factor`) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(insertQuery, ps -> {
            ps.setTimestamp(1 ,Timestamp.valueOf(LocalDateTime.now()));
            ps.setDouble(2, power.getRmsVoltage());
            ps.setDouble(3, power.getRmsCurrent());
            ps.setDouble(4, power.getApparentPower());
            ps.setDouble(5, power.getRealPower());
            ps.setDouble(6, power.getPowerFactor());
        });
    }
}
