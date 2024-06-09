package com.Projet.Projet.Audit;


import com.Projet.Projet.Audit.TypeAudit.TypeAudit;
import com.Projet.Projet.utilisateur.User.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "audit")
@NoArgsConstructor
@AllArgsConstructor
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tauxconformite;
    private String datedebut;
    private String datefin;
    private int conformite;

    @ManyToOne
    @JoinColumn(name = "id_typeAudit")
    private TypeAudit typeAudit;

//    @ManyToOne
//    @JoinColumn(name = "id_statutAudit")
//    private StatutAudit statutAudit;
//
//    @ManyToOne
//    @JoinColumn(name = "id_echelle")
//    private Echelle echelle;
//
//    @ManyToOne
//    @JoinColumn(name = "id_referentiel")
//    private Referentiel referentiel;
//
//    @ManyToOne
//    @JoinColumn(name = "id_audites")
//    private Audites audites;
//
//    @OneToMany
//    @JoinColumn(name = "id_rapport")
//    private Rapport rapport;
//
@JsonBackReference
@ManyToOne
@JoinColumn(name = "id_utilisateur")
private User user;

}
