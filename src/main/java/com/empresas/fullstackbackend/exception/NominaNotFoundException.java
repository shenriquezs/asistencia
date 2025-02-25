package com.empresas.fullstackbackend.exception;


public class NominaNotFoundException extends RuntimeException{
    public NominaNotFoundException(Long id){
        super("Could not found the Nomina with id "+ id);
    }
}
