/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestortareasgarciagironsaul;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dam2
 */
public class GestorTareas {

    List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public boolean registrar(Tarea T1) {
        boolean valido = false;
        if (tareas.add(T1)) {
            valido = true;
        }
        return valido;
    }

    public void listar() {
        if (tareas.isEmpty()) {
            System.out.println("No hay ninguna tarea guardada");
        } else {
            Iterator<Tarea> IT = tareas.iterator();
            while (IT.hasNext()) {
                Tarea T1 = IT.next();
                System.out.println(T1.toString());
            }
        }
    }

    public boolean eliminar(int id) {
        boolean valido = false;
        if (tareas.isEmpty()) {
            System.out.println("No hay ninguna tarea guardada");
        } else {
            Iterator<Tarea> IT = tareas.iterator();
            while (IT.hasNext() && !valido) {
                Tarea T1 = IT.next();
                if (T1.getId() == id) {
                    IT.remove();
                    valido = true;
                }
            }
        }
        return valido;
    }

    public boolean completada(int id) {
        boolean valido = false;
        if (tareas.isEmpty()) {
            System.out.println("No hay ninguna tarea guardada");
        } else {
            Iterator<Tarea> IT = tareas.iterator();
            while (IT.hasNext() && !valido) {
                Tarea T1 = IT.next();
                if (T1.getId() == id && T1.isCompletada() == false) {
                    T1.setCompletada(true);
                    valido = true;
                }
            }
        }
        return valido;
    }
}
