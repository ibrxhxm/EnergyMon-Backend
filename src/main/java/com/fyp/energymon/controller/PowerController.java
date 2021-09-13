package com.fyp.energymon.controller;

import com.fyp.energymon.request.PowerRequest;
import com.fyp.energymon.service.PowerService;
import com.fyp.energymon.util.RequestParser;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emon")
public class PowerController {
    private final PowerService powerService;

    public PowerController(PowerService powerService) {
        this.powerService = powerService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> add(@RequestBody String input){
        final RequestParser requestParser = new RequestParser(input);

        PowerRequest powerRequest = new PowerRequest(requestParser.getData());
        JSONObject response = powerService.add(powerRequest.validateRequest());

        return ResponseEntity.status(HttpStatus.OK).body(response.toString());
    }
}
