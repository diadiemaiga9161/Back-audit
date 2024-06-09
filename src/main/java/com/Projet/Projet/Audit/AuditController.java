package com.Projet.Projet.Audit;

import com.Projet.Projet.Message.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:62082"}, maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("api/audit")
public class AuditController {
    @Autowired
    private AuditService auditService;

    @GetMapping("/afficher")
    public List<Audit> Afficher(){
        return auditService.Afficher();
    }

    //AJOUTER Une audit
    //    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/ajouter")
    public Object Ajouter (@RequestBody Audit audit) throws IOException {
        return auditService.Ajouter(audit);
    }

    //MODIFIER UNE audit
//    @PreAuthorize("hasRole('ADMIN')") qui veut dire seule l'admin peut joue sur cette fonction
    @PutMapping("/modifier")
    public MessageResponse modifier(@RequestBody Audit audit) {
        auditService.Modifier(audit);
        return new MessageResponse("Audit  Modifie avec succes", true);
    }

    //SUPPRIMER UN audit  PROFESSIONELLE
    //@PreAuthorize("hasRole('ADMIN')") qui veut dire seule l'admin peut joue sur cette fonction
    @DeleteMapping("/supprimer/{id_audit}")
    public MessageResponse Supprimer(@PathVariable("id_audit") Long id_audit){
        return auditService.Supprimer(id_audit);
    }

}
