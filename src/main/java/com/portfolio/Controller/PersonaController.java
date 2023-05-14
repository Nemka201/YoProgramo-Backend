package com.portfolio.Controller;

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
import com.portfolio.Service.ImpPersonaService;
import org.springframework.web.bind.annotation.RequestParam;


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
	public Persona editPersona(@PathVariable int id, @RequestParam("nombre") String nuevoNombre,
			@RequestParam("apellido") String nuevoApellido, @RequestParam("imagen") String nuevaImagen) {

		Persona perso = interPersona.findPersona(id);

		perso.setNombre(nuevoNombre);
		perso.setApellido(nuevoApellido);
		perso.setImg(nuevaImagen);

		interPersona.savePersona(perso);

		return perso;
	} 
	@GetMapping("/traer/perfil")
	public Persona findPersona() {
		return interPersona.findPersona((int) 1);
	}

}
