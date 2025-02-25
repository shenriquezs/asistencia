package com.empresas.fullstackbackend.controller;



import com.empresas.fullstackbackend.exception.NominaNotFoundException;
import com.empresas.fullstackbackend.model.Nomina;
import com.empresas.fullstackbackend.repository.NominaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class NominaController {

    @Autowired
    private NominaRepository nominaRepository;

    @PostMapping("/nomina")
    Nomina newNomina(@RequestBody Nomina newNomina) {
        return nominaRepository.save(newNomina);
    }

    @GetMapping("/nominas")
    List<Nomina> getAllNominas() {
        return nominaRepository.findAll();
    }

    @GetMapping("/nomina/{id}")
    Nomina getNominaById(@PathVariable Long id) {
        return nominaRepository.findById(id)
                .orElseThrow(() -> new NominaNotFoundException(id));
    }

}
