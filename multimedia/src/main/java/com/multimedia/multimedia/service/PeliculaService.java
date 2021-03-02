package com.multimedia.multimedia.service;

import com.multimedia.multimedia.model.PeliculaModel;
import com.multimedia.multimedia.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository peliculaRepository;

    public List<PeliculaModel> obtenerPeliculas(){
        return (List<PeliculaModel>) peliculaRepository.findAll();
    }

    public PeliculaModel guardarPelicula(PeliculaModel peliculaModel){
        return peliculaRepository.save(peliculaModel);
    }

    public PeliculaModel actualizarPelicula(PeliculaModel peliculaModel){
        PeliculaModel actualizaP = new PeliculaModel();
        if (null == actualizaP){
            return null;
        }
        actualizaP.setId(peliculaModel.getId());
        actualizaP.setNombre(peliculaModel.getNombre());
        actualizaP.setAño(peliculaModel.getAño());
        actualizaP.setDescripcion(peliculaModel.getDescripcion());
        return peliculaRepository.save(actualizaP);
    }

}
