package com.empresas.fullstackbackend.repository;

import com.empresas.fullstackbackend.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarcaRepository extends JpaRepository<Marca,Long> {

    List<Marca> findByRut(String rut);
}
