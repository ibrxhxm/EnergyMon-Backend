package com.fyp.energymon.service;

import com.fyp.energymon.dto.PowerDTO;
import com.fyp.energymon.model.Power;
import com.fyp.energymon.repository.PowerRepository;
import com.fyp.energymon.util.JB;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class PowerServiceImpl implements PowerService{
    private final PowerRepository powerRepository;

    public PowerServiceImpl(PowerRepository powerRepository) {
        this.powerRepository = powerRepository;
    }
    @Override
    public JSONObject add(PowerDTO powerDTO) {
        Power power = new Power();
        power.setRmsVoltage(powerDTO.getRmsVoltage());
        power.setRmsCurrent(powerDTO.getRmsCurrent());
        power.setApparentPower(powerDTO.getApparentPower());
        power.setRealPower(powerDTO.getRealPower());
        power.setPowerFactor(powerDTO.getPowerfactor());

        powerRepository.add(power);
        return JB.buildOkResponse();
    }
}
