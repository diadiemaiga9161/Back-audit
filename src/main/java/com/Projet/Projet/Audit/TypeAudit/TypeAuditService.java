package com.Projet.Projet.Audit.TypeAudit;

import com.Projet.Projet.Audit.Audit;
import com.Projet.Projet.Message.MessageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TypeAuditService {

    MessageResponse Supprimer(Long id_typeAudit);  // LA METHODE PERMETTANT DE SUPPRIMER UN typeAudit

    TypeAudit Modifier(TypeAudit typeAudit);   // LA METHODE PERMETTANT DE MODIFIER UN audit

    List<TypeAudit> Afficher();      // LA METHODE PERMETTANT D'AFFICHER LES TypeAudits

    Object Ajouter(TypeAudit typeAudit); // LA METHODE PERMETTANT D'AJOUTER UN TypeAudit

    TypeAudit TypeAuditId(Long id_typeAudit); // LA METHODE PERMETTANT D'AFFICHER UN audit EN FONCTION DE SON ID

    MessageResponse modifierTypeAudit(
            Long id,
            String nom);
}
