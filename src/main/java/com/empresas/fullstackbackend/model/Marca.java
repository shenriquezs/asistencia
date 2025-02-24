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
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rut;
    private Date fechaHora;
    private String tipo;
    private Date fecha;


}
