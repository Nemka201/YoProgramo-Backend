/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Repository;

import com.portfolio.Entity.HYS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nemka201
 */
@Repository
public interface HYSRepository extends JpaRepository<HYS, Integer>{
    Optional<HYS> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
