package com.Projet.Projet.utilisateur.TypeAuditeur;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Table(name = "typeAuditeur")
@NoArgsConstructor
@AllArgsConstructor
public class TypeAuditeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(max = 200)
    private String typeAuditeur;
}
