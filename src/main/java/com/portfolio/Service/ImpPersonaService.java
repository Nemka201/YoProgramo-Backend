package com.portfolio.Service;

import com.portfolio.Entity.Persona;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.Repository.IPersonaRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository iPersonaRepository;
    
    public List<Persona> list(){
         return iPersonaRepository.findAll();
     }
     
	@Autowired
	private IPersonaRepository personaRepository;
        
	@Override
        public List<Persona> getPersona() {
		List<Persona> listaPersonas = personaRepository.findAll();
		return listaPersonas;
	}
        
	@Override
	public void savePersona(Persona p) {
		personaRepository.save(p);
	}
        
	@Override
	public void deletePersona(int id) {
		personaRepository.deleteById(id);		
	}
        
	@Override
	public Persona findPersona(int id) {
		Persona p = personaRepository.findById(id).orElse(null);
		return p;
	}
}
