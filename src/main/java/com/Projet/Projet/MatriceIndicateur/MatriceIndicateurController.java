package com.Projet.Projet.MatriceIndicateur;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:62082"}, maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("api/matriceindicateur")
public class MatriceIndicateurController {
}
