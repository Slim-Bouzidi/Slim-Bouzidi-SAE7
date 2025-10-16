package com.slimbouzidi.sae7.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private Long cin;

    private String ecole;

    private Date dateNaissance;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Reservation> reservation;

}
