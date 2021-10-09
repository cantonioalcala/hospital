package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.Consultation;
import com.worshop.hospital.entity.ConsultationDetail;
import com.worshop.hospital.repository.ConsultationDetailRepository;
import com.worshop.hospital.service.ConsultationDetailService;
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
public class ConsultationDetailServiceImpl implements ConsultationDetailService {

    private final ConsultationDetailRepository consultationDetailRepository;

    @Override
    public ConsultationDetail save(ConsultationDetail consultationDetail) {
        return consultationDetailRepository.save(consultationDetail);
    }

    @Override
    public ConsultationDetail findId(Integer id) {
        return consultationDetailRepository.findById(id).orElse(new ConsultationDetail());
    }

    @Override
    public List<ConsultationDetail> findAll() {
        return consultationDetailRepository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        consultationDetailRepository.delete(new ConsultationDetail(id, null, null, null));
        return Boolean.TRUE;
    }
}
