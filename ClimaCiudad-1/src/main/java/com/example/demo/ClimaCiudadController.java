package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.util.*;

@RestController
@RequestMapping("/clima")
public class ClimaCiudadController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getClima(@RequestParam(required = false) String ciudad){
        if (ciudad == null || ciudad.isEmpty()) {
            return ResponseEntity
                .badRequest()
                .body(Collections.singletonMap("error", "Debe indicar una ciudad"));
        }

        Double temperatura = getTemperaturaCiudad(ciudad);

        if (temperatura == null) {
            return ResponseEntity
                .badRequest()
                .body(Collections.singletonMap("error", "No se ha podido obtener información del clima"));
        }

        String estado;
        if (temperatura <= 10) estado = "Frio";
        else if (temperatura <= 25 ) estado = "Templado";
        else estado = "Caluroso";

        Map<String, Object> resp = new HashMap<>();
        resp.put("ciudad", ciudad);
        resp.put("temperatura", temperatura);
        resp.put("estado", estado);

        return ResponseEntity.ok(resp);
    }

    private Double getTemperaturaCiudad(String ciudad) {
        Map<String, Double> temps = new HashMap<>();
        temps.put("buenos aires", 23.5);
        temps.put("madrid", 27.0);
        temps.put("bariloche", 8.0);
        temps.put("chaco", 34.1);
        if(ciudad == null) return null;
        return temps.getOrDefault(ciudad.toLowerCase().trim(), null);
    }
}