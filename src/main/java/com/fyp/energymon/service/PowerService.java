package com.fyp.energymon.service;

import com.fyp.energymon.dto.PowerDTO;
import org.json.JSONObject;

public interface PowerService {
    JSONObject add(PowerDTO powerDTO);
}
