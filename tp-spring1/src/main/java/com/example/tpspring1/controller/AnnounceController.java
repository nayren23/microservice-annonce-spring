package com.example.tpspring1.controller;

import com.example.tpspring1.model.entity.AnnonceEntity;
import com.example.tpspring1.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announce/")
public class AnnounceController {
    private final AnnounceService announceService;

    @Autowired
    public AnnounceController(AnnounceService announceService) {
        this.announceService = announceService;
    }

    @GetMapping("/announces")
    public List<AnnonceEntity> getAllAnnounces() {
        return announceService.getAllAnnounces();
    }

    @PostMapping("/announce/add")
    public String announceAdd(@RequestParam(value = "title") String title,
                              @RequestParam(value = "description") String description,
                              @RequestParam(value = "address") String address,
                              @RequestParam(value = "mail") String mail) {
        announceService.addAnnounce(title,description,address,mail);
        return String.format("Nouvelle annonce ajoutée : Titre = %s, Description = %s, Adresse = %s, Mail = %s", title, description, address, mail);
    }
}
