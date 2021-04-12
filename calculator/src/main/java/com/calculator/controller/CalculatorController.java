package com.calculator.controller;

import com.calculator.model.Calculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculatorController {

    @GetMapping(value="/calculate/{operation}/{expression}")
    public ResponseEntity<Calculator> calculate(@PathVariable(name = "operation") String operation,
                                                @PathVariable(name = "expression") String expression ) {

        RestTemplate restTemplate = new RestTemplate();
        String uri = "https://newton.vercel.app/api/v2/{operation}/{expression}";

        Map<String, String> params = new HashMap<String, String>();
        params.put("operation", operation);
        params.put("expression", expression);

        Calculator calculator = restTemplate.getForObject(uri, Calculator.class, params);

        return new ResponseEntity<Calculator>(calculator, HttpStatus.OK);
    }
}

