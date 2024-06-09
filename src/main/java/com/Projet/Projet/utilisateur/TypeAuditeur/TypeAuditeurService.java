package com.Projet.Projet.utilisateur.TypeAuditeur;

import com.Projet.Projet.Message.MessageResponse;

import java.util.List;

public interface TypeAuditeurService {
    MessageResponse Supprimer(Long id_specialite);  // LA METHODE PERMETTANT DE SUPPRIMER UN typeAuditeur

    TypeAuditeur Modifier(TypeAuditeur typeAuditeur);   // LA METHODE PERMETTANT DE MODIFIER UN typeAuditeur

    List<TypeAuditeur> Afficher();       // LA METHODE PERMETTANT D'AFFICHER LES typeAuditeur

    Object Ajouter(TypeAuditeur typeAuditeur); // LA METHODE PERMETTANT D'AJOUTER UN typeAuditeur


    TypeAuditeur AfficherParId(Long id);
}
