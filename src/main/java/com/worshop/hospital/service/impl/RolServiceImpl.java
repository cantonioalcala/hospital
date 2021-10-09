package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.Rol;
import com.worshop.hospital.repository.RolRepository;
import com.worshop.hospital.service.RolService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User: Cristhian
 * Date: 8/10/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@RequiredArgsConstructor
@Service
@Slf4j
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    @Override
    public Rol saveRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Boolean deleteRol(Integer id) {
        rolRepository.delete(new Rol(id, null, null));
        return Boolean.TRUE;
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id).orElse(new Rol());
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }
}
