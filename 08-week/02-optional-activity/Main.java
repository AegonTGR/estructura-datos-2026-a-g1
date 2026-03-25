package com.example;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregarEstudiante("Dania");
        lista.agregarEstudiante("Valentina");
        lista.agregarEstudiante("Leonidas");
        lista.agregarEstudiante("Elizabeth");
        System.out.println("Lista de estudiantes:");
        lista.imprimirLista();
    }
}
