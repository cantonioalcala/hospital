package com.worshop.hospital.controller;

import com.worshop.hospital.entity.PersonType;
import com.worshop.hospital.entity.Rol;
import com.worshop.hospital.service.PersonTypeService;
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
 * Date: 8/10/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/person-type", produces = "application/json")
public class PersonTypeController {
    private final PersonTypeService personTypeService;

    @PostMapping
    private ResponseEntity<?> savePersonType(@RequestBody PersonType personType) {
        log.info("init method savePersonType:{}", personType);
        return new ResponseEntity<>(personTypeService.save(personType), HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<?> getAll() {
        log.info("init method getAllPersonType");
        return new ResponseEntity<>(personTypeService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<?> getById(@PathVariable Integer id) {
        log.info("init method getById:{}", id);
        return new ResponseEntity<>(personTypeService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<?> delete(@PathVariable Integer id) {
        log.info("init method delete:{}", id);
        return new ResponseEntity<>(personTypeService.delete(id), HttpStatus.OK);
    }
}
