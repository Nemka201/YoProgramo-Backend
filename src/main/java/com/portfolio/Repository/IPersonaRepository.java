package com.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.Entity.Persona;

public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
