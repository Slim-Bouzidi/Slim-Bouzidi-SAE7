package com.slimbouzidi.sae7.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idUniversite;

     String nomUniversite;

     String adresse;

    @OneToOne
    private Foyer foyer;
}
