package com.fyp.energymon.exception;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ApiException extends ResponseStatusException {
    private JSONObject responseBody;

    public ApiException(HttpStatus status, JSONObject responseBody) {
        super(status);
        this.responseBody = responseBody;
    }

    public ApiException(HttpStatus status) {
        super(status);
    }

    public ApiException(HttpStatus status, String reason) {
        super(status, reason);
    }

    public ApiException(HttpStatus status, String reason, Throwable cause) {
        super(status, reason, cause);
    }

    public JSONObject getResponseBody() {
        return responseBody;
    }

}
