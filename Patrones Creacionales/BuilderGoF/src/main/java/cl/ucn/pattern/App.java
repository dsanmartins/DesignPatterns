package cl.ucn.pattern;

public class App
{
    public static void main( String[] args )
    {
        String nombre = "Ingenieria de Software";
        Director director = new Director();
        LibroBuilder builder = new LibroBuilder();
        director.getLibro(builder, nombre);
        Libro libro = builder.getLibro();
        libro.imprimirDatosLibro();


        director = new Director();
        builder = new LibroBuilder();
        director.getLibroAutorEditorAnho(builder, nombre);
        libro = builder.getLibro();
        libro.imprimirDatosLibro();

    }
}
