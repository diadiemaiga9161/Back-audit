package com.Projet.Projet.Audites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "audites")
@NoArgsConstructor
@AllArgsConstructor
public class Audites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

//    @OneToMany
//    @JoinColumn(name = "id_audit")
//    private Audit audit;

//    @ManyToMany
//    @JoinColumn(name = "id_utilisateur")
//    private User user;
}
