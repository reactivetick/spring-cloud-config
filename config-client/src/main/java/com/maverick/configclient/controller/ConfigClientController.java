package com.maverick.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigClientController {

    @Value("${config.profile:}")
    private String profile;

    @Value("${app.name:}")
    private String appName;

    @GetMapping(path = "/")
    public Map<String, String> main() {
        Map<String, String> map = new HashMap<>();
        map.put("activeProfile", profile);
        map.put("appName", appName);
        return map;
    }

}
