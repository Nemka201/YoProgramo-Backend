package com.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.Entity.Persona;
import java.util.Optional;

public interface IPersonaRepository extends JpaRepository<Persona,Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre (String nombre);
}
