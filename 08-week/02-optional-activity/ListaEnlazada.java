package com.example;


public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }
    public void agregarEstudiante(String nombre) {
        Nodo nuevoNodo = new Nodo(nombre);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temporal = cabeza;
            while (temporal.siguiente != null) {
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevoNodo;  //
        }
    }
    public void imprimirLista() {
        Nodo temporal = cabeza;
        while (temporal != null) {
            System.out.println(temporal.nombre);
            temporal = temporal.siguiente;
        }
    }
}