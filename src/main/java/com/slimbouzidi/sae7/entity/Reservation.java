package com.slimbouzidi.sae7.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToOne
    private Chambre chambre;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "reservation")
    private Set<Etudiant> etudiant;
}
