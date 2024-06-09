package com.Projet.Projet.Audites;

import com.Projet.Projet.Audit.TypeAudit.TypeAudit;
import com.Projet.Projet.Audit.TypeAudit.TypeAuditService;
import com.Projet.Projet.Message.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:62082"}, maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("api/audites")
public class AuditesController {
    @Autowired
    private AuditesService auditesService;

    @GetMapping("/afficher")
    public List<Audites> Afficher(){
        return auditesService.Afficher();
    }

    //AJOUTER Un type audites
    //    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/ajouter")
    public Object Ajouter (@RequestBody Audites audites) throws IOException {
        return auditesService.Ajouter(audites);
    }

    //MODIFIER UNE type audites
//    @PreAuthorize("hasRole('ADMIN')") qui veut dire seule l'admin peut joue sur cette fonction
    @PutMapping("/modifier")
    public MessageResponse modifier(@RequestBody Audites audites) {
        auditesService.Modifier(audites);
        return new MessageResponse("Audites  Modifie avec succes", true);
    }

    //SUPPRIMER UN type audit
    //@PreAuthorize("hasRole('ADMIN')") qui veut dire seule l'admin peut joue sur cette fonction
    @DeleteMapping("/supprimer/{id_audites}")
    public MessageResponse Supprimer(@PathVariable("id_audites") Long id_audites){
        return auditesService.Supprimer(id_audites);
    }

}
