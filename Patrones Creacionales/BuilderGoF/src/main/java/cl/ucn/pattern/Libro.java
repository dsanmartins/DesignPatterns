package cl.ucn.pattern;

public class Libro {

    String nombre;
    String autores;
    String editorial;
    String anho;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditor(String editorial) {
        this.editorial = editorial;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public void imprimirDatosLibro() {
        System.out.println("Nombre: " + this.nombre + " Autores: " + this.autores + " Editorial: " + this.editorial + " Anho: " + this.anho );
    }
}
