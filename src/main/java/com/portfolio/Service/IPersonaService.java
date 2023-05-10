/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Service;

import com.portfolio.Entity.Persona;
import java.util.List;

/**
 *
 * @author muert
 */
public interface IPersonaService {
	
	public List<Persona> getPersona();
	
	public void savePersona(Persona perso);
	
	public void deletePersona(int id);
	
	public Persona findPersona(int id);

}
