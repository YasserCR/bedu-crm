package org.bedu.crmbedu.controllers;

import org.bedu.crmbedu.models.PlantillaCorreo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/correo")
public class CorreoController {

    @GetMapping("/{correoId}")
    public ResponseEntity<PlantillaCorreo> getCorreo(@PathVariable Long correoId){
        return ResponseEntity.ok(new PlantillaCorreo());
    }

    @GetMapping
    public ResponseEntity <List<PlantillaCorreo>> getCorreos(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaCorreo(@RequestBody PlantillaCorreo plantillaCorreo){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{correoId}")
    public ResponseEntity<Void> actualizaCorreo(@PathVariable Long correoId, @RequestBody PlantillaCorreo plantillaCorreo){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{correoId}")
    public ResponseEntity<Void> eliminaCorreo(@PathVariable Long correoId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
