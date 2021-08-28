package com.worshop.hospital.controller;

import com.worshop.hospital.model.api.request.AddRolRequest;
import com.worshop.hospital.service.RolService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@AllArgsConstructor
@RequestMapping(value = "/rol")
public class RolController {

    private final RolService rolService;

    @PostMapping(value = "/", produces = "application/json", consumes = "application/json")
    private ResponseEntity<?> save(@RequestBody AddRolRequest addRolRequest) {
        log.info("init method saveRol:{}", addRolRequest);
        return new ResponseEntity<>(rolService.addRol(addRolRequest), HttpStatus.OK);
    }
}
