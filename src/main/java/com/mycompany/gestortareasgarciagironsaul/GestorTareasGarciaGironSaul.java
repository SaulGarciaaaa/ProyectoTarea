/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestortareasgarciagironsaul;

import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class GestorTareasGarciaGironSaul {

    public static void main(String[] args) {
        GestorTareas GT=new GestorTareas();
        int opcion=0;
        do{
            System.out.println("Gestor de Tareas");
            System.out.println("1- Crear Tarea");
            System.out.println("2- Listar");
            System.out.println("3- Modificar a completada");
            System.out.println("4- Eliminar");
            System.out.println("5- Salir");
            System.out.println("Ingrese una opcion: ");
            opcion=new Scanner(System.in).nextInt();
            switch(opcion){
                case 1->{
                    System.out.println("Introduce su id");
                    int id=new Scanner(System.in).nextInt();
                    System.out.println("Introduce su descripcion");
                    String desc=new Scanner(System.in).nextLine();
                    Tarea T1=new Tarea(id,desc);
                    if (GT.registrar(T1)) {
                        System.out.println("Se ha registrado la tarea correctamnete");
                    }else{
                        System.out.println("No se ha podido registrar la tarea ");
                    }
                }
                case 2->
                    GT.listar();
                case 3->{
                    System.out.println("Introduce la id de la Tarea a modificar");
                    int id=new Scanner(System.in).nextInt();
                    if (GT.completada(id)) {
                        System.out.println("La actividad paso a estar competada");
                    }else{
                        System.out.println("La tarea ya esta completada o no existe");
                    }
                }
                case 4->{
                    System.out.println("Introduce la id de la tarea a modificar");
                    int id=new Scanner(System.in).nextInt();
                    if (GT.eliminar(id)) {
                        System.out.println("Se elimino la tarea");
                    }else{
                        System.out.println("No se encontro ninguna tarea con ese id");
                    }
                }
                default->{
                    System.out.println("Introduce una opcion valida");
                }
            }
        }while(opcion!=5);
    }
}
