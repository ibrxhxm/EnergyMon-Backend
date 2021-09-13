package com.fyp.energymon.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JB {

    public static JSONObject buildErrorResponse(String status, String message, String info) {
        JSONObject responseJSON = new JSONObject();

        responseJSON.put("meta", buildMeta(status, message, info));
        responseJSON.put("data", new JSONObject());
        return responseJSON;
    }

    public static JSONObject buildISResponse() {
        JSONObject responseJSON = new JSONObject();

        responseJSON.put("meta", buildMeta("500", "INTERNAL_SERVER_ERROR", "Error occured while processing your request please try again later"));
        responseJSON.put("data", new JSONObject());
        return responseJSON;
    }

    public static JSONObject buildBadRequestResponse() {

        JSONObject responseJSON = new JSONObject();

        responseJSON.put("meta", buildMeta("400", "BAD_REQUEST", "invalid request could not be processed"));
        responseJSON.put("data", new JSONObject());
        return responseJSON;
    }

    public static JSONObject buildBadRequestResponse(JSONObject responseData) {

        JSONObject responseJSON = new JSONObject();

        responseJSON.put("meta", buildMeta("400", "BAD_REQUEST", "invalid request could not be processed"));
        responseJSON.put("data", responseData);
        return responseJSON;
    }

    public static JSONObject buildNotFoundResponse() throws JSONException {
        JSONObject response = new JSONObject();
        response.put("meta", buildMeta("404", "NOT_FOUND", "Resource not found"));
        response.put("data", new JSONObject());
        return response;
    }

    public static JSONObject buildMeta(String status, String message, String info) throws JSONException {
        JSONObject meta = new JSONObject();
        meta.put("status", status);
        meta.put("message", message);
        meta.put("info", info);
        return meta;
    }

    public static JSONObject buildOKMeta() throws JSONException {
        JSONObject meta = new JSONObject();
        meta.put("status", "200");
        meta.put("message", "OK");
        meta.put("info", "Request processed successfully");
        return meta;
    }

    public static JSONObject buildOkResponse(JSONObject responseDataJSON) throws JSONException {
        JSONObject response = new JSONObject();
        response.put("meta", buildOKMeta());
        response.put("data", responseDataJSON);
        return response;
    }

    public static JSONObject buildOkResponse() throws JSONException {
        JSONObject response = new JSONObject();
        response.put("meta", buildOKMeta());
        response.put("data", new JSONObject());
        return response;
    }


    public static JSONObject buildQuickResponse(String status, String message, String info) throws JSONException {
        JSONObject response = new JSONObject();
        response.put("meta", buildMeta(status, message, info));
        response.put("data", new JSONObject());
        return response;
    }
}

