import java.util.Objects;

public class Movie {  //Klasa z nadpisanymi metodami equals oraz Hashcode

    private String title;
    private int duration;

    public Movie(String title, int duration) {
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
        Movie movie = (Movie) o;
        return duration == movie.duration && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + title.hashCode();
        result = 31 * result + duration;
        return result;
    }
}
