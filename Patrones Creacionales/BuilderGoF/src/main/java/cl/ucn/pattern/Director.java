package cl.ucn.pattern;

import java.util.ArrayList;
import java.util.List;

public class Director {


    public void getLibro(Builder builder, String nombreLibro){

        builder.reset();
        //realiza busqueda en base de datos por nombreLibro
        //db.search(nombreLibro)
        builder.setNombre("Ingenieria de Software");
    }

    public void getLibroAutor(Builder builder, String nombreLibro){

        builder.reset();
        //realiza busqueda en base de datos por nombreLibro
        //db.search(nombreLibro)
        builder.setNombre("Ingenieria de Software");
        builder.setAutores("Marco Tulio, Ricardo Guerra");

    }

    public void getLibroAutorEditor(Builder builder, String nombreLibro){

        builder.reset();
        //realiza busqueda en base de datos por nombreLibro
        //db.search(nombreLibro)
        builder.setNombre("Ingenieria de Software");
        builder.setAutores("Marco Tulio, Ricardo Guerra");
        builder.setEditorial("Planeta");

    }

    public void getLibroAutorEditorAnho(Builder builder, String nombreLibro){
        builder.reset();
        //realiza busqueda en base de datos por nombreLibro
        //db.search(nombreLibro)
        builder.setNombre("Ingenieria de Software");
        builder.setAutores("Marco Tulio, Ricardo Guerra");
        builder.setEditorial("Planeta");
        builder.setAnho("2020");
    }

}
