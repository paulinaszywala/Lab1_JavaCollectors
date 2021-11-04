import java.util.Objects;

public class Movie2 {   //Klasa z nadpisaną metodą equals, ale bez nadpisanej metody Hashcode
    private String title;
    private int duration;

    public Movie2(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void getMovieInfo(){

        System.out.println(title + " - czas trwania: " + duration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie2 movie2 = (Movie2) o;
        return duration == movie2.duration && Objects.equals(title, movie2.title);
    }

}
