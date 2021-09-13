package com.fyp.energymon.util;

import org.json.JSONObject;

public class FormValidator {
    private final JSONObject formErrors = new JSONObject();

    public void addError(boolean isFaulty, String key, String value) {
        if (isFaulty) {
            formErrors.put(key, value);
        }
    }

    public void addError(String key, String value) {
        formErrors.put(key, value);
    }
}
