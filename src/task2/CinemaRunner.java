package task2;

import java.time.LocalTime;

/**
 * Created by sergey.kliepikov on 3/15/18.
 */
public class CinemaRunner {
    public static void main(String[] args) {
        Movie titanic = new Movie("Titanic", 1999, 180, "Cool movie");

        HallForSession mainHall = new HallForSession(10, 10);
        HallForSession smallHall = new HallForSession(6, 5);

        MovieSession titanicInMainHall = new MovieSession(LocalTime.of(13, 30), 200, mainHall, titanic);
        MovieSession titanicInSmallHall = new MovieSession(LocalTime.of(19, 00),200, smallHall, titanic);

        mainHall.book(1,1);
        mainHall.book(1,2);
        mainHall.book(1,3);
        mainHall.book(1,4);
        mainHall.book(1,5);
        mainHall.book(1,6);
        mainHall.book(1,7);
        mainHall.book(1,8);
        mainHall.book(1,9);
        mainHall.book(1,10);

        System.out.println("Places booked in the first hall: " + mainHall.getPlacesReserved());
        System.out.println("Places not booked in the first hall: " + mainHall.getPlacesFree());

        smallHall.book(1,1);
        smallHall.book(2,1);
        smallHall.book(3,1);

        System.out.println("Places booked in the second hall: " + smallHall.getPlacesReserved());
        System.out.println("Places not booked in the second hall: " + smallHall.getPlacesFree());

        System.out.println("Money got for first session: " + titanicInMainHall.ptofitPerSession());
        System.out.println("Money got for second session: " + titanicInSmallHall.ptofitPerSession());
    }
}
