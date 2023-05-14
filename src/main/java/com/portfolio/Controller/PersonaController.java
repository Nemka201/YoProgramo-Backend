package com.portfolio.Controller;

import com.portfolio.Dto.dtoPersona;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.Entity.Persona;
import com.portfolio.Security.Controller.Mensaje;
import com.portfolio.Service.ImpPersonaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@CrossOrigin(origins = {"http://localhost:4200","https://porftfolio-nemka201.web.app"})
@RestController
@RequestMapping("/Persona")
public class PersonaController {
        @Autowired
	private ImpPersonaService interPersona;

	@GetMapping("/traer")
	public List<Persona> getPersona() {
		return interPersona.getPersona();
	}

	//@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/crear")
	public String createStudent(@RequestBody Persona perso) {
		interPersona.savePersona(perso);
		return "La persona fue creada correctamente";
	}

	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/delete/{id}")
	public String deletePersona(@PathVariable int id) {
		interPersona.deletePersona(id);
		return "La persona fue eliminada correctamente";
	}

	//@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
        public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPersona dtopersona){
        if(StringUtils.isBlank(dtopersona.getNombre())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtopersona.getApellido())){
            return new ResponseEntity(new Mensaje("El apellido es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtopersona.getImg())){
            return new ResponseEntity(new Mensaje("La imagen es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        
        Persona persona = interPersona.findPersona(id);
        
        persona.setNombre(dtopersona.getNombre());
        persona.setImg(dtopersona.getImg());
        
        
        interPersona.savePersona(persona);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
    } 
	@GetMapping("/traer/perfil")
	public Persona findPersona() {
		return interPersona.findPersona((int) 1);
	}

}
