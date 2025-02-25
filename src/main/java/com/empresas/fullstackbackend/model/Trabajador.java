package com.empresas.fullstackbackend.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString


@Entity
@Data
@Table(name = "trabajador")
public class Trabajador  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;



}
