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
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToOne
    private Chambre chambre;

    @ManyToMany(mappedBy = "reservation", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Etudiant> etudiant;
}
