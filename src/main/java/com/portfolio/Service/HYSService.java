/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Service;

import com.portfolio.Entity.HYS;
import com.portfolio.Repository.HYSRepository;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author muert
 */
@Transactional
@Service
public class HYSService {
    @Autowired
    HYSRepository rhys;
    
    public List<HYS> list(){
        return rhys.findAll();
    }
    
    public Optional<HYS> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<HYS> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(HYS skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
}
