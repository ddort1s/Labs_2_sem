package Labs13_z2_var4;

import java.util.*;

class Film {
    private String title;
    private String country;
    private Integer year;

    public Film(String title) {
        this.title = title;
        this.country = null;
        this.year = null;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public Integer getYear() {
        return year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String countryStr = (country == null) ? "null" : country;
        String yearStr = (year == null) ? "null" : year.toString();
        return title + ", " + countryStr + "-" + yearStr;
    }
}


public class FilmLibraryManager {

    private static Map<String, Film> films = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("> ");

            try {
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    continue;
                }

                String[] parts = input.split("\\s+", 3);
                String command = parts[0].toLowerCase();

                if (command.equals("stop")) {
                    running = false;
                    displayAllFilms();
                }
                else if (command.equals("search")) {
                    if (parts.length >= 2) {
                        processSearch(parts[1]);
                    }
                }
                else if (command.equals("add")) {
                    if (parts.length >= 3) {
                        processAdd(parts[1], parts[2]);
                    }
                }

            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static void processAdd(String title, String parameter) {
        try {
            Integer year = Integer.parseInt(parameter);
            addFilmWithYear(title, year);
        } catch (NumberFormatException e) {
            addFilmWithCountry(title, parameter);
        }
    }

    private static void addFilmWithYear(String title, Integer year) {
        if (films.containsKey(title)) {
            films.get(title).setYear(year);
        } else {
            Film film = new Film(title);
            film.setYear(year);
            films.put(title, film);
        }
    }

    private static void addFilmWithCountry(String title, String country) {
        if (films.containsKey(title)) {
            films.get(title).setCountry(country);
        } else {
            Film film = new Film(title);
            film.setCountry(country);
            films.put(title, film);
        }
    }

    private static void processSearch(String title) {
        if (films.containsKey(title)) {
            System.out.println(films.get(title));
        } else {
            System.out.println("no such title");
        }
    }

    private static void displayAllFilms() {
        if (films.isEmpty()) {
            return;
        }

        List<Film> sortedFilms = new ArrayList<>(films.values());

        sortedFilms.removeIf(film -> film.getYear() == null);

        sortedFilms.sort(Comparator.comparing(Film::getTitle));

        for (Film film : sortedFilms) {
            System.out.println(film);
        }
    }
}