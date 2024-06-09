package com.Projet.Projet.Audites;

import com.Projet.Projet.Message.MessageResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuditesService {

    MessageResponse Supprimer(Long id_Audites);  // LA METHODE PERMETTANT DE SUPPRIMER UN Audites

    Audites Modifier(Audites audites);   // LA METHODE PERMETTANT DE MODIFIER UN audites

    List<Audites> Afficher();      // LA METHODE PERMETTANT D'AFFICHER LES Audites

    Object Ajouter(Audites audites); // LA METHODE PERMETTANT D'AJOUTER UN Audites

    Audites AuditesId(Long id_Audites); // LA METHODE PERMETTANT D'AFFICHER UN audites EN FONCTION DE SON ID

    MessageResponse modifierAudites(
            Long id,
            String nom);
}
