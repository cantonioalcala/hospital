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
 * Date: 27/08/2021
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
@Table(schema = Constans.SCHEMA_DB, name = "PERSONA_ROL")
public class PersonRol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSONA_ROL_ID")
    private Integer personRolId;
    @OneToOne
    @JoinColumn(name = "PERSONA_ID", nullable = false)
    private Person person;
    @OneToOne
    @JoinColumn(name = "ROL_ID", nullable = false)
    private Rol rol;
}
