package com.worshop.hospital.entity;

import com.worshop.hospital.util.Constants;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * User: Cristhian
 * Date: 28/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = Constants.SCHEMA_DB, name = "DETALLE_CONSULTA")
public class ConsultationDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DETALLE_CONSULTA_ID")
    private Integer consultationDetailId;
    @Column(name = "DIAGNOSTICO")
    private String diagnostic;
    @Column(name = "TRATAMIENTO")
    private String treatment;
    @ManyToOne
    @JoinColumn(name = "CONSULTA_ID")
    private Consultation consultation;
}
