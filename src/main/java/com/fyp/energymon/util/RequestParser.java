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

        if(!isValidData(payload)) {
            throw new RequestSyntaxException("Invalid request body");
        }

        this.data = payload.getJSONObject("data");
    }

    public JSONObject getData() {
        return data;
    }

    public boolean isValidData(JSONObject payload) {
        boolean hasRmsVoltage = payload.has("rms_voltage");
        boolean hasRmsCurrent = payload.has("rms_current");
        boolean hasRealPower = payload.has("real_power");
        boolean hasApparentPower = payload.has("apparent_power");
        boolean hasPowerFactor = payload.has("power_factor");

        if (hasApparentPower && hasPowerFactor && hasRealPower && hasRmsVoltage && hasRmsCurrent) {
            return true;
        }
        return false;
    }
}