package com.Projet.Projet.utilisateur.TypeAuditeur;

import com.Projet.Projet.Message.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8100"}, maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("api/typeauditeur")
public class TypeAuditeurController {
    @Autowired
    private TypeAuditeurService typeAuditeurService;

    //AJOUTER UNE typeAuditeur
//    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/ajouter")
    public Object Ajouter(@RequestBody TypeAuditeur typeAuditeur){
        return typeAuditeurService.Ajouter(typeAuditeur);
    }

    //AFFICHER LES typeAuditeur
    @GetMapping("/afficher")
    public List<TypeAuditeur> Afficher(){
        return typeAuditeurService.Afficher();
    }

    //MODIFIER UN typeAuditeur
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping({"/modifier"})
    public MessageResponse Modifier(@RequestBody TypeAuditeur typeAuditeur){
        typeAuditeurService.Modifier(typeAuditeur);
        return new MessageResponse("SPecialite Modifiee avec succes", true);
    }

    //SUPPRIMER UN typeAuditeur
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/supprimer/{id_specialite}")
    public MessageResponse Supprimer(@PathVariable("id_specialite") Long id_specialite){
        return typeAuditeurService.Supprimer(id_specialite);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/afficherparId/{id}")
    public TypeAuditeur AfficherParId(@PathVariable("id") Long id){
        return typeAuditeurService.AfficherParId(id);
    }

}
