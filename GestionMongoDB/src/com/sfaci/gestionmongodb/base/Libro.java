package com.sfaci.gestionmongodb.base;

import org.bson.types.ObjectId;

import java.util.Date;

/**
 * Created by dam on 10/02/17.
 */
public class Libro {

    private ObjectId id;
    private String titulo;
    private String descripcion;
    private String autor;
    private Date fecha;
    private boolean disponible;
    private Editorial editorial;

    public Libro() {

    }

    public void setId(ObjectId id) { this.id = id; }

    public ObjectId getId() { return id; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
