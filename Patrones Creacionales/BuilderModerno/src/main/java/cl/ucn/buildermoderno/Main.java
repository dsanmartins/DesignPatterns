package cl.ucn.buildermoderno;

import cl.ucn.buildermoderno.Main;

public class Main {
    public static void main(String [] args) {
        Libro esm = new Libro.Builder()
                .setNombre("Ingeniería Software Moderna")
                .setEditorial("UCN")
                .setAnho("2020")
                .build();
        System.out.println("Libro 1: " + esm.toString());

        Libro gof = new Libro.Builder()
                .setNombre("Design Patterns")
                .setAutores("GoF")
                .setAnho("1995")
                .build();
        System.out.println("Libro 2: " + gof.toString());
    }
}