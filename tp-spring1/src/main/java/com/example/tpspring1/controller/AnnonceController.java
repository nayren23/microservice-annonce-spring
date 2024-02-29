package com.example.tpspring1.controller;

import com.example.tpspring1.entity.AnnonceEntity;
import com.example.tpspring1.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class AnnonceController {
    private final AnnonceService annonceService;

    @Autowired
    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }

    @GetMapping("/annonce/display")
    public List<AnnonceEntity> getAllAnnonces() {
        return annonceService.getAllAnnonces();
    }

    @GetMapping("/annonce/add")
    public String annonceAdd(@RequestParam(value = "title") String title,
                             @RequestParam(value = "description") String description,
                             @RequestParam(value = "address") String address,
                             @RequestParam(value = "mail") String mail) {
        annonceService.addAnnonce(title,description,address,mail);
        return String.format("Nouvelle annonce ajoutée : Titre = %s, Description = %s, Adresse = %s, Mail = %s", title, description, address, mail);
    }
}
