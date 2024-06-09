package com.Projet.Projet.Audit.TypeAudit;

import com.Projet.Projet.Audit.Audit;
import com.Projet.Projet.Audit.AuditRepository;
import com.Projet.Projet.Message.MessageResponse;
import com.Projet.Projet.utilisateur.User.User;
import com.Projet.Projet.utilisateur.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.Projet.Projet.utilisateur.User.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypeAuditImpl implements  TypeAuditService{

    @Autowired
    private TypeAuditRepository typeAuditRepository;

    @Override
    public MessageResponse Supprimer(Long id_typeAudit) {
        return null;
    }

    @Override
    public TypeAudit Modifier(TypeAudit typeAudit) {
        return null;
    }

    @Override
    public List<TypeAudit> Afficher() {
        return List.of();
    }

    @Override
    public Object Ajouter(TypeAudit typeAudit) {
        return null;
    }


//    public Object Ajouter(TypeAudit typeAudit) {
//        // Enregistrer l'audit
//        typeAuditRepository.save(typeAudit);
//        return new MessageResponse("TypeAudit ajouté avec succès", true);
//
//        // Obtenir l'utilisateur connecté à partir de l'objet Authentication
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUsername = authentication.getName();
//        // Obtenir l'utilisateur à partir de la base de données en fonction de l'username
//        Optional<User> userOptional = userRepository.findByEmail(currentUsername);
//        if (userOptional.isPresent()) {
////            typeAuditeur.setUser(userOptional.get());
//
//            auditRepository.save(audit);
//            return new MessageResponse("typeAudit ajouter avec succes", true);
//        }else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("TypeAudit non trouvé", false));
//        }
//    }

    @Override
    public TypeAudit TypeAuditId(Long id_typeAudit) {
        return null;
    }


    @Override
    public MessageResponse modifierTypeAudit(Long id, String nom) {
        return null;
    }
}
