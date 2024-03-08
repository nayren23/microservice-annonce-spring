package com.example.tpspring1.service;

import com.example.tpspring1.dao.AnnounceDAO;
import com.example.tpspring1.model.entity.AnnonceEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnnounceService {
    private final AnnounceDAO announceDAO;

    public AnnounceService(AnnounceDAO announceDAO) {
        this.announceDAO = announceDAO;
    }

    public List<AnnonceEntity> getAllAnnounces() {
        return announceDAO.findAll();
    }

    public void addAnnounce(String title, String description, String address, String mail) {
        AnnonceEntity announce = new AnnonceEntity(title,description,address,mail);
        announceDAO.save(announce);
    }
}