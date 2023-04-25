package com.portfolio.Interface;

import java.util.List;
import com.portfolio.Entity.Persona;

public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);

    //Eliminar un objeto por ID
    public void deletePersona(Long id);

    //Buscar objeto por ID
    public Persona findPersona(Long id);
}
