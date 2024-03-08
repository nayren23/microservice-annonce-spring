package com.example.tpspring1.dao;

import com.example.tpspring1.model.entity.AnnonceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnounceDAO extends JpaRepository<AnnonceEntity, Long> {
    List<AnnonceEntity> findAll();
}