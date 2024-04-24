package cl.ucn.buildermoderno;

class Libro {
   private String nombre;
   private String autores;
   private String editorial;
   private String anho;
  
   private Libro (String nombre, String autores, String editorial, String anho) {
     this.nombre = nombre;
     this.autores = autores;
     this.editorial = editorial;
     this.anho = anho;
   }
  
   public String toString() {
     return nombre + ". " + autores + "," + editorial + "," + anho;
   }
    
   public static class Builder {
     private String nombre;
     private String autores;
     private String editorial;
     private String anho;
     
     public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
     }

     public Builder setAutores(String autores) {
        this.autores = autores;
        return this;
     }
     
     public Builder setEditorial(String editoral) {
        this.editorial = editoral;
        return this;
     }
     
     public Builder setAnho(String anho) {
        this.anho = anho;
        return this;
     }
     
     public Libro build() {
        return new Libro(nombre, autores, editorial, anho);
     }
  }
}