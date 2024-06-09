package com.Projet.Projet.Echelle;

import com.Projet.Projet.Audites.Audites;
import com.Projet.Projet.Audites.AuditesRepository;
import com.Projet.Projet.Message.MessageResponse;
import com.Projet.Projet.utilisateur.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EchelleImple implements EchelleService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EchelleRepository echelleRepository;

    @Override
    public MessageResponse Supprimer(Long id_echelle) {
        return null;
    }

    @Override
    public Echelle Modifier(Echelle echelle) {
        return null;
    }

    @Override
    public List<Echelle> Afficher() {
        return List.of();
    }

    @Override
    public Object Ajouter(Echelle echelle) {
        // Enregistrer l'audit
        echelleRepository.save(echelle);
        return new MessageResponse("Echelle ajouté avec succès", true);

//        // Obtenir l'utilisateur connecté à partir de l'objet Authentication
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUsername = authentication.getName();
//        // Obtenir l'utilisateur à partir de la base de données en fonction de l'username
//        Optional<User> userOptional = userRepository.findByEmail(currentUsername);
//        if (userOptional.isPresent()) {
////            connaissances.setUser(userOptional.get());
//
//            auditRepository.save(audit);
//            return new MessageResponse("Echelle ajouter avec succes", true);
//        }else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("Audit non trouvé", false));
//        }
    }


    @Override
    public Echelle EchelleId(Long id_Echelle) {
        return null;
    }



    @Override
    public MessageResponse modifierEchelle(Long id, String nom,String description) {
        return null;
    }

}
