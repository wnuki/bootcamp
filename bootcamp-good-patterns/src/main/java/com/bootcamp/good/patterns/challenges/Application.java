package com.bootcamp.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String >> movies = new HashMap<>();
        movies = movieStore.getMovies();

        System.out.println(movieStore.titles(movies));
    }
}
