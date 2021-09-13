package com.fyp.energymon.request;

import com.fyp.energymon.dto.PowerDTO;
import org.json.JSONObject;

public class PowerRequest {
    private JSONObject data;

    private double rmsVoltage;
    private double rmsCurrent;
    private double realPower;
    private double apparentPower;
    private double powerFactor;

    public PowerRequest(JSONObject data) {
        this.data = data;
    }

    public PowerDTO validateRequest() {
        this.rmsVoltage = data.optDouble("rms_voltage", 0.00);
        this.rmsCurrent = data.optDouble("rms_current", 0.00);
        this.apparentPower = data.optDouble("apparent_power", 0.00);
        this.realPower = data.optDouble("real_power", 0.00);
        this.powerFactor = data.optDouble("power_factor", 0.00);

        PowerDTO powerDTO = new PowerDTO();
        powerDTO.setRmsVoltage(rmsVoltage);
        powerDTO.setRmsCurrent(rmsCurrent);
        powerDTO.setApparentPower(apparentPower);
        powerDTO.setRealPower(realPower);
        powerDTO.setPowerfactor(powerFactor);

        return powerDTO;
    }
}
