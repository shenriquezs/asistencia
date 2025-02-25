package com.empresas.fullstackbackend.repository;

import com.empresas.fullstackbackend.model.Empresa;
import com.empresas.fullstackbackend.model.Nomina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NominaRepository extends JpaRepository<Nomina,Long> {
}
