
package com.portfolio.Security.Services;

import com.portfolio.Security.Entity.Rol;
import com.portfolio.Security.Enums.RolNombre;
import com.portfolio.Security.Repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(RolNombre.ROLE_USER);
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
