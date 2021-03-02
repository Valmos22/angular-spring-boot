package com.multimedia.multimedia.controller;


import com.multimedia.multimedia.model.PeliculaModel;
import com.multimedia.multimedia.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "v1/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping(path = "/pelicula")
    public List<PeliculaModel> obtenerPeliculas(){
        return peliculaService.obtenerPeliculas();
    }

    @GetMapping(path = "/guardar/{id}")
    public PeliculaModel gurdarPelicula(@RequestBody PeliculaModel peliculaModel){
        return this.peliculaService.guardarPelicula(peliculaModel);
    }

    @GetMapping(path = "/actualizar/{id}")
    public PeliculaModel actualizarPerlicula(PeliculaModel peliculaModel){
        return this.peliculaService.actualizarPelicula(peliculaModel);
    }
    
}
