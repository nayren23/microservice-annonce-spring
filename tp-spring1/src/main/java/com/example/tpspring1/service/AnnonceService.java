package com.example.tpspring1.service;

import com.example.tpspring1.dao.AnnonceDAO;
import com.example.tpspring1.model.entity.AnnonceEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnnonceService {
    private final AnnonceDAO annonceDAO;

    public AnnonceService(AnnonceDAO annonceDAO) {
        this.annonceDAO = annonceDAO;
    }

    public List<AnnonceEntity> getAllAnnonces() {
        return annonceDAO.findAll();
    }

    public void addAnnonce(String title, String description, String address, String mail) {
        AnnonceEntity annonce = new AnnonceEntity(title,description,address,mail);
        annonceDAO.save(annonce);
    }
}
