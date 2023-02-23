package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Persona;

public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
