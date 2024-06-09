package com.Projet.Projet.utilisateur.TypeAuditeur;

import com.Projet.Projet.Message.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeAuditeurServiceImple implements TypeAuditeurService {

    @Autowired
    TypeAuditeurRepository typeAuditeurRepository;

    @Override
    public MessageResponse Supprimer(Long id_typeAuditeur) {
        typeAuditeurRepository.deleteById(id_typeAuditeur);
        return new MessageResponse("typeAuditeur Supprimee avec succes", true);
    }


    @Override
    public TypeAuditeur Modifier(TypeAuditeur typeAuditeur) {
        return typeAuditeurRepository.findById(typeAuditeur.getId())
                .map(p->{
                    p.setTypeAuditeur(typeAuditeur.getTypeAuditeur());
                    return typeAuditeurRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("typeAuditeur non trouvé !"));
    }

    @Override
    public List<TypeAuditeur> Afficher() {
        return typeAuditeurRepository.findAll();
    }

    @Override
    public Object Ajouter(TypeAuditeur typeAuditeur) {
        TypeAuditeur typeAuditeur1 = typeAuditeurRepository.findByTypeAuditeur(typeAuditeur.getTypeAuditeur());
        if (typeAuditeur1==null){
            typeAuditeurRepository.save(typeAuditeur);
            return new MessageResponse("typeAuditeur ajoutee avec succes", true);
        }else {
            return new MessageResponse("typeAuditeur existe deja", false);
        }
    }

    @Override
    public TypeAuditeur AfficherParId(Long id) {
        return typeAuditeurRepository.findById(id).get();
    }
}
