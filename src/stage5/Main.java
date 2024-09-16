package stage5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList(new City("Russia", "Moscow"), new City("Belarus", "Minsk"), new City("Ukraine", "Kiev"), new City("Russia", "Tver"), new City("Russia", "Smolensk"));

        System.out.println(cities.stream().filter(x -> x.country.equals("Russia"))
                .sorted((c1, c2) -> Integer.compare(c2.name.length(), c1.name.length()))
                .map(x -> x.name + " ").reduce("", String::concat));

    }

    static class City {
        private String country;
        private String name;

        public City(String country, String name) {
            this.country = country;
            this.name = name;
        }
    }
}