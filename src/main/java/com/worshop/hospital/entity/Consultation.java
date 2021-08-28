package com.worshop.hospital.entity;

import com.worshop.hospital.util.Constans;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(schema = Constans.SCHEMA_DB, name = "CONSULTA")
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONSULTA_ID")
    private Integer consultationId;
    @ManyToOne
    @JoinColumn(name = "PERSONA_MEDICO_ID", nullable = false)
    private Person personDoctor;
    @ManyToOne
    @JoinColumn(name = "PERSONA_PACIENTE_ID", nullable = false)
    private Person personPatient;

}
