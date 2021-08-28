package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.Rol;
import com.worshop.hospital.model.api.dto.AddRolDto;
import com.worshop.hospital.model.api.request.AddRolRequest;
import com.worshop.hospital.repository.RolRepository;
import com.worshop.hospital.service.RolService;
import com.worshop.hospital.service.mapper.RolMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User: Cristhian
 * Date: 27/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Slf4j
@AllArgsConstructor
@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;
    private final RolMapper rolMapper;

    @Override
    public AddRolDto addRol(AddRolRequest addRolRequest) {
        log.info("call db!!!");
//        Rol rs = rolRepository.save(convertToRol(addRolRequest));
//        log.info("result db:{}", rs);
       return rolMapper.convertToAddRolDto(
             rolRepository.save(rolMapper.convertToRol(addRolRequest)));
       // return convertToAddRolDto(rs);
    }

    private Rol convertToRol(AddRolRequest addRolRequest) {
        Rol rol = new Rol();
        rol.setDescription(addRolRequest.getDescription());
        rol.setName(addRolRequest.getName());
        return rol;
    }

    private AddRolDto convertToAddRolDto(Rol rol) {
        return AddRolDto.builder()
                .rolId(rol.getRolId())
                .name(rol.getName())
                .description(rol.getDescription()).build();
    }
}
