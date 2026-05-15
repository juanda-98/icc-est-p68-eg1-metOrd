package models;

public class Movie {
  private String title;
  private int anio;
  

  public Movie(String title, int anio) {
    this.title = title;
    this.anio = anio;
  }
  public Movie() {
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getAnio() {
    return anio;
  }
  public void setAnio(int anio) {
    this.anio = anio;
  }
  @Override
  public String toString() {
    return "Movie [title=" + title + ", anio=" + anio + "]";
  }
  
  
}
