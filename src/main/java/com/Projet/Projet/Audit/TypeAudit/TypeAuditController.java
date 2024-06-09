package com.Projet.Projet.Audit.TypeAudit;

import com.Projet.Projet.Audit.Audit;
import com.Projet.Projet.Audit.AuditService;
import com.Projet.Projet.Message.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:62082"}, maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("api/typeaudit")
public class TypeAuditController {

    @Autowired
    private TypeAuditService typeAuditService;

    @GetMapping("/afficher")
    public List<TypeAudit> Afficher(){
        return typeAuditService.Afficher();
    }

    //AJOUTER Un type audit
    //    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/ajouter")
    public Object Ajouter (@RequestBody TypeAudit typeAudit) throws IOException {
        return typeAuditService.Ajouter(typeAudit);
    }

    //MODIFIER UNE type audit
//    @PreAuthorize("hasRole('ADMIN')") qui veut dire seule l'admin peut joue sur cette fonction
    @PutMapping("/modifier")
    public MessageResponse modifier(@RequestBody TypeAudit typeAudit) {
        typeAuditService.Modifier(typeAudit);
        return new MessageResponse("TypeAudit  Modifie avec succes", true);
    }

    //SUPPRIMER UN type audit
    //@PreAuthorize("hasRole('ADMIN')") qui veut dire seule l'admin peut joue sur cette fonction
    @DeleteMapping("/supprimer/{id_typeAudit}")
    public MessageResponse Supprimer(@PathVariable("id_typeAudit") Long id_audit){
        return typeAuditService.Supprimer(id_audit);
    }

}
