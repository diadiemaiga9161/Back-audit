package com.Projet.Projet.Rapport;

import com.Projet.Projet.Audit.Audit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "rapport")
@NoArgsConstructor
@AllArgsConstructor
public class Rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_audit")
    private Audit audit;


}
