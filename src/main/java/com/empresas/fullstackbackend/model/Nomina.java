package com.empresas.fullstackbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString


@Entity
@Data
@Table(name = "nomina")
public class Nomina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;

    private String tipo;

    private Date fechaInicio;
    private Date fechaFin;
}
