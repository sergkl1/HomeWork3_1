package task2;

import java.time.LocalTime;

/**
 * Created by sergey.kliepikov on 3/15/18.
 */
public class MovieSession {
    private final Movie movie;
    private final HallForSession hallForSession;
    private final long price;
    private final LocalTime beginTime;

    public MovieSession(LocalTime beginTime, long price, HallForSession hallForSession, Movie movie) {
        this.beginTime = beginTime;
        this.price = price;
        this.hallForSession = hallForSession;
        this.movie = movie;
    }

    public long ptofitPerSession() {
        return hallForSession.getPlacesReserved() * this.price;
    }
}
