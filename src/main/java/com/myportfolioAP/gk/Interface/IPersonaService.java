package com.myportfolioAP.gk.Interface;

import com.myportfolioAP.gk.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    // traer listado de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscando por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
