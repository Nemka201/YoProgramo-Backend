package com.portfolio.Security.Repository;

import com.portfolio.Security.Enums.RolNombre;
import com.portfolio.Security.Entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rol);
    
}
