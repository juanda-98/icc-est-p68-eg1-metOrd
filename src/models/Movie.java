package models;

public class Movie {
  private String nombre;
  private int anio;
  public Movie() {
  }
  public Movie(String nombre, int anio) {
    this.nombre = nombre;
    this.anio = anio;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getAnio() {
    return anio;
  }
  public void setAnio(int anio) {
    this.anio = anio;
  }
  @Override
  public String toString() {
    return "Movie [nombre=" + nombre + ", anio=" + anio + "]";
  }

  
}
