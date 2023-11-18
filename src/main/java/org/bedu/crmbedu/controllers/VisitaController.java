package org.bedu.crmbedu.controllers;

import org.bedu.crmbedu.models.Visita;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visita")
public class VisitaController {

    @GetMapping("/{visitaId}")
    public ResponseEntity<Visita> getVisita(@PathVariable Long visitaId){
        return ResponseEntity.ok(new Visita());
    }

    @GetMapping
    public ResponseEntity <List<Visita>> getVisitas(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaVisita(@RequestBody Visita visita){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{visitaId}")
    public ResponseEntity<Void> actualizaVisita(@PathVariable Long visitaId, @RequestBody Visita visita){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{visitaId}")
    public ResponseEntity<Void> eliminaVisita(@PathVariable Long visitaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
