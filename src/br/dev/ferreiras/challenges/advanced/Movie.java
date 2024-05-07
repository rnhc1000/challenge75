package br.dev.ferreiras.challenges.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Movie {
  private String name;
  private String genre;

  public Movie(String name, String genre) {
    this.name = name;
    this.genre = genre;
  }

  public String getName() {
    return name;
  }

  public String getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return "Movie{" +
            "name='" + name + '\'' +
            ", genre='" + genre + '\'' +
            '}';
  }

  public static void main(String[] args) {
    List<Movie> movies = new ArrayList<>();

    movies.add(new Movie("Knives Out","Comedy"));
    movies.add(new Movie("Ready Player One", "Action"));
    movies.add(new Movie("Edge of Tomorrow", "Action"));
    movies.add(new Movie("Home Alone", "Comedy"));

    Map<String, List<Movie>> map = movies.stream().collect(Collectors.groupingBy(Movie::getGenre));
    System.out.println(map);
  }
}

