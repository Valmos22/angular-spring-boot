package com.multimedia.multimedia.model;

import javax.persistence.*;

@Entity
@Table(name = "peliculas")
public class PeliculaModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Integer id;

    public String nombre;
    public String año;
    public String descripcion;

    public PeliculaModel() {
    }

    public PeliculaModel(Integer id, String nombre, String año, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
