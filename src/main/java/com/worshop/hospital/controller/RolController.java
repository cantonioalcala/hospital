package com.worshop.hospital.controller;

import com.worshop.hospital.entity.Rol;
import com.worshop.hospital.service.RolService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * User: Cristhian
 * Date: 28/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/rol", produces = "application/json")
public class RolController {

    private final RolService rolService;

    @PostMapping
    private ResponseEntity<?> save(@RequestBody Rol rol) {
        log.info("init method saveRol:{}", rol);
        return new ResponseEntity<>(rolService.saveRol(rol), HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<?> getAll() {
        log.info("init method getAllRol");
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<?> getById(@PathVariable Integer id) {
        log.info("init method getById:{}", id);
        return new ResponseEntity<>(rolService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<?> delete(@PathVariable Integer id) {
        log.info("init method delete:{}", id);
        return new ResponseEntity<>(rolService.deleteRol(id), HttpStatus.OK);
    }
}
