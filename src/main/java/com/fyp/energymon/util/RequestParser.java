package com.fyp.energymon.util;

import com.fyp.energymon.exception.RequestSyntaxException;
import org.json.JSONObject;

import java.util.Objects;

public class RequestParser {
    private final JSONObject data;

    public RequestParser(String input) throws RequestSyntaxException {
        final JSONObject payload = new JSONObject(input);

        if(payload.isNull("data")) {
            throw new RequestSyntaxException("Invalid request body");
        }

        if(!isValidData(payload.getJSONObject("data"))) {
            throw new RequestSyntaxException("Invalid request body");
        }

        this.data = payload.getJSONObject("data");
    }

    public JSONObject getData() {
        return data;
    }

    public boolean isValidData(JSONObject data) {
        boolean hasRmsVoltage = data.has("rms_voltage");
        boolean hasRmsCurrent = data.has("rms_current");
        boolean hasRealPower = data.has("real_power");
        boolean hasApparentPower = data.has("apparent_power");
        boolean hasPowerFactor = data.has("power_factor");

        return hasApparentPower && hasPowerFactor && hasRealPower && hasRmsVoltage && hasRmsCurrent;
    }
}