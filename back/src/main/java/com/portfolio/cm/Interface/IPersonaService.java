package com.portfolio.cm.Interface;

import com.portfolio.cm.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // TRAER UNA LISTA DE PERSONAS
    public List<Persona> getPersona();
    
    // GUARDAR UN OBJETO DE TIPO PERSONA
    public void savePersona(Persona persona);
    
    // ELIMINAR UN OBJETO pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //BUSCAR UNA PERSONA por ID
    public Persona  findPersona(Long id);
}
