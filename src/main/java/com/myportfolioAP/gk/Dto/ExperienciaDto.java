package com.myportfolioAP.gk.Dto;

import javax.validation.constraints.NotBlank;


public class ExperienciaDto {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    //constructor

    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    
    //Setters y getters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
    
}
