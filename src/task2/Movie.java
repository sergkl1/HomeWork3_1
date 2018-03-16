package task2;

/**
 * Created by sergey.kliepikov on 3/15/18.
 */
public class Movie {
    private final String name;
    private final int year;
    private final int duration;
    private final String description;

    public Movie(String name, int year, int duration, String description) {
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.description = description;
    }

    @Override
    public String toString() {
        return "CinemaRunner{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                '}';
    }
}
