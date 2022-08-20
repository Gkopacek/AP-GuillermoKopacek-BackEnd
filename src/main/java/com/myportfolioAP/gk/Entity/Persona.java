package com.myportfolioAP.gk.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @NotNull
    @Size(min = 3, max = 50, message = "El nombre no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 3, max = 50, message = "El apellido no cumple con la longitud")
    private String apellido;
    
    
    @Size(min = 3, max = 50, message = "la img no cumple con la longitud")
    private String img;
    
    
}
