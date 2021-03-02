package com.multimedia.multimedia.repository;

import com.multimedia.multimedia.model.PeliculaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaModel, Integer> {

}
