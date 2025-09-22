/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestortareasgarciagironsaul;

/**
 *
 * @author dam2
 */
public class Tarea {
    private int id;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        completada = false;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", descripcion=" + descripcion + ", completada=" + completada + '}';
    }

    
}
