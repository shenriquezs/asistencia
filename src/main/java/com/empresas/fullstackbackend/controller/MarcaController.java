package com.empresas.fullstackbackend.controller;

import com.empresas.fullstackbackend.exception.MarcaNotFoundException;
import com.empresas.fullstackbackend.exception.TrabajadorNotFoundException;
import com.empresas.fullstackbackend.model.Empresa;
import com.empresas.fullstackbackend.model.Marca;
import com.empresas.fullstackbackend.model.Trabajador;
import com.empresas.fullstackbackend.repository.EmpresaRepository;
import com.empresas.fullstackbackend.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;


    @PostMapping("/marca")
    Marca newMarca(@RequestBody Marca newMarca) {
        return marcaRepository.save(newMarca);
    }

    @GetMapping("/marcas")
    List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }


    @GetMapping("/marca/{rut}")
    List<Marca> getMarcaByRut(@PathVariable String rut) {
        return marcaRepository.findByRut(rut);

    }




}
