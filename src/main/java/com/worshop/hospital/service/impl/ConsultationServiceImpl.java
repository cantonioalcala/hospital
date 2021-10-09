package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.Consultation;
import com.worshop.hospital.repository.ConsultationRepository;
import com.worshop.hospital.service.ConsultationService;
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
@Slf4j
@RequiredArgsConstructor
@Service
public class ConsultationServiceImpl implements ConsultationService {

    private final ConsultationRepository consultationRepository;

    @Override
    public Consultation save(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Consultation findId(Integer id) {
        return consultationRepository.findById(id).orElse(new Consultation());
    }

    @Override
    public List<Consultation> findAll() {
        return consultationRepository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        consultationRepository.delete(new Consultation(id,null,null));
        return Boolean.TRUE;
    }
}
