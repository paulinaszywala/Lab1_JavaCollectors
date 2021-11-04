import java.util.HashMap;
import java.util.Map;

public class EqualsHashcode {

    public void tellMeTheDifference() {


        System.out.println("Różnica pomiędzy sytuacją gdy nadpiszemy obie metody, a gdy nadpiszemy na przykład tylko equals zostanie pokazana przy użyciu dwóch klas Movie.");

        Movie2 movie1 = new Movie2("Diuna", 2);
        Movie2 movie2 = new Movie2("Diuna", 2);   //Tworzymy dwa takie same obiekty klasy Movie2 -> klasy z nadpisaną metodą equals i nie nadpisaną Hashcode

        System.out.println();
        System.out.println("Utworzyliśmy dwa takie same obiekty klasy Movie 2 - klasy z nadpisaną metodą equals i nie nadpisaną Hashcode");
        System.out.println("Sprawdzamy za pomocą pętli if(movie1.equals(movie2)) czy to są te same filmy. Organizator przyjęcia o tym nie wie.");
        System.out.println();

        if (movie1.equals(movie2))
            System.out.println("Tak, to te same filmy.");
        else
            System.out.println("Nie, to nie te same filmy.");

        Map<Movie2, String> mapOfMovies = new HashMap<>();

        mapOfMovies.put(movie1, "Do obejrzenia");
        mapOfMovies.put(movie2, "Nie do obejrzenia");

        System.out.println();
        System.out.println("Organizator przyjęcia zdecydował, że wraz z gośćmi zdąży obejrzeć tylko jeden film. Chce sprawdzić, który zaproponuje mu program.");
        System.out.println();

        movie1.getMovieInfo();
        System.out.println(" - " + mapOfMovies.get(movie1));
        movie2.getMovieInfo();
        System.out.println(" - " + mapOfMovies.get(movie2));
        System.out.println();

        System.out.println("Kolekcja Map nie przyjmuje duplikatów, a chwilę wcześniej było powiedziane, że to dokładnie te same obiekty.");
        System.out.println("Bez nadpisanej metody hashcode, program myśli, że hashcode'y obu obiektów są różne.");
        System.out.println();
        System.out.println("Teraz zrobimy dokładnie to samo tylko tworząc obiekty klasy Movie, gdzie nadpisana została metoda equals oraz metoda hashcode.");
        System.out.println();

        Movie movie3 = new Movie("Diuna", 2);
        Movie movie4 = new Movie("Diuna", 2);   //Tworzymy dwa takie same obiekty klasy Movie -> obie metody nadpisane

        System.out.println("Ponownie sprawdźmy czy to będą te same obiekty - te same filmy.");
        System.out.println();

        if (movie1.equals(movie2))
            System.out.println("Tak, to te same filmy.");
        else
            System.out.println("Nie, to nie te same filmy.");

        Map<Movie, String> mapOfMovies2 = new HashMap<>();

        System.out.println();
        mapOfMovies2.put(movie3, "Do obejrzenia");
        mapOfMovies2.put(movie4, "Nie do obejrzenia");

        movie3.getMovieInfo();
        System.out.println(" - " + mapOfMovies2.get(movie3));
        movie4.getMovieInfo();
        System.out.println(" - " + mapOfMovies2.get(movie4));

        System.out.println();
        System.out.println("Tym razem program widzi, że oba obiekty mają już ten sam hashcode, dzięki czemu wartości tych obiektów w mapie zostały nadpisane tą najnowszą - podaną jako ostatnia.");
        System.out.println("Wychodzi na to, że goście nie obejrzą żadnego filmu przez nieuwagę autora programu, szkoda.");
    }
}
