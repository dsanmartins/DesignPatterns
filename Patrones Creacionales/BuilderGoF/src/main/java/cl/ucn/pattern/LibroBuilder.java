package cl.ucn.pattern;

public class LibroBuilder implements Builder{

    Libro libro;

    public LibroBuilder () {
        this.reset();
    }

    @Override
    public void reset() {
        this.libro = new Libro();
    }

    @Override
    public void setNombre(String nombre) {
        this.libro.setNombre(nombre);
    }

    @Override
    public void setAutores(String autores) {
        this.libro.setAutores(autores);
    }

    @Override
    public void setEditorial(String editorial) {
        this.libro.setEditor(editorial);
    }

    @Override
    public void setAnho(String anho) {
        this.libro.setAnho(anho);
    }

    public Libro getLibro(){
        return this.libro;
    }
}
