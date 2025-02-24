package com.empresas.fullstackbackend.exception;



public class MarcaNotFoundException extends RuntimeException{
    public MarcaNotFoundException(String rut){
        super("Could not found the Marca with rut "+ rut);
    }
}