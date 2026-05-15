package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        int n = movies.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if ((movies[j].getTitle().compareTo(movies[minIndex].getTitle()) < 0)) {
                    minIndex = j;
                }
            }
            Movie temp = movies[minIndex];
            movies[minIndex] = movies[i];
            movies[i] = temp;
        }
    }

}
