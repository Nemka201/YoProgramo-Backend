/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Controller;

import com.portfolio.Dto.dtoHYS;
import com.portfolio.Entity.HYS;
import com.portfolio.Security.Controller.Mensaje;
import com.portfolio.Service.HYSService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author muert
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200","https://porftfolio-nemka201.web.app"})
@RequestMapping("/skill")
public class HYSController {

    @Autowired
    HYSService shys;
    
    @GetMapping("/lista")
    public ResponseEntity<List<HYS>> list() {
        List<HYS> list = shys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HYS> getById(@PathVariable("id") int id) {
        if (!shys.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        HYS hYs = shys.getOne(id).get();
        return new ResponseEntity(hYs, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHYS dtohys) {
        if (StringUtils.isBlank(dtohys.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtohys.getSubtitle())) {
            return new ResponseEntity(new Mensaje("El subtitulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        HYS hYs = new HYS(dtohys.getNombre(), dtohys.getPorcentaje(), dtohys.getSubtitle());
        shys.save(hYs);

        return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHYS dtohys) {
        //Validamos si existe el ID
        if (!shys.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtohys.getSubtitle())) {
            return new ResponseEntity(new Mensaje("El subtitulo es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        HYS hYs = shys.getOne(id).get();
        hYs.setNombre(dtohys.getNombre());
        hYs.setPorcentaje(dtohys.getPorcentaje());
        hYs.setSubtitle(dtohys.getSubtitle());

        shys.save(hYs);
        return new ResponseEntity(new Mensaje("Skill actualizada"), HttpStatus.OK);
    }
}
