package com.Projet.Projet.Audites;

import com.Projet.Projet.Audit.Audit;
import com.Projet.Projet.Audit.AuditRepository;
import com.Projet.Projet.Message.MessageResponse;
import com.Projet.Projet.utilisateur.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditesImple implements AuditesService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuditesRepository auditesRepository;

    @Override
    public MessageResponse Supprimer(Long id_audites) {
        return null;
    }

    @Override
    public Audites Modifier(Audites audites) {
        return null;
    }

    @Override
    public List<Audites> Afficher() {
        return List.of();
    }

    @Override
    public Object Ajouter(Audites audites) {
        // Enregistrer l'audit
        auditesRepository.save(audites);
        return new MessageResponse("Audites ajouté avec succès", true);

//        // Obtenir l'utilisateur connecté à partir de l'objet Authentication
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUsername = authentication.getName();
//        // Obtenir l'utilisateur à partir de la base de données en fonction de l'username
//        Optional<User> userOptional = userRepository.findByEmail(currentUsername);
//        if (userOptional.isPresent()) {
////            connaissances.setUser(userOptional.get());
//
//            auditRepository.save(audit);
//            return new MessageResponse("Audit ajouter avec succes", true);
//        }else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("Audit non trouvé", false));
//        }
    }


    @Override
    public Audites AuditesId(Long id_Audites) {
        return null;
    }

    @Override
    public MessageResponse modifierAudites(Long id, String nom) {
        return null;
    }
}
