package com.worshop.hospital.entity;

import com.worshop.hospital.util.Constans;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@ToString
@Entity
@Table(schema = Constans.SCHEMA_DB, name = "ROL")
public class Rol implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ROL_ID")
    private Integer rolId;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "DESCRIPCION")
    private String Description;
}
