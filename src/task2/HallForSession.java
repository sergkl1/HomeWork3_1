package task2;

import java.util.Arrays;

/**
 * Created by sergey.kliepikov on 3/15/18.
 */
public class HallForSession {
    private final int row;
    private final int placesInRow;
    private boolean[][] hall;

    public HallForSession(int placesInRow, int row) {
        if (placesInRow < 0 || row < 0) throw new IllegalArgumentException("Illegal number of rows or places in a row");
        this.hall = new boolean[row][placesInRow];
        this.placesInRow = placesInRow;
        this.row = row;
    }

    public void book(int row, int placeInRow) {
        if (row > this.row || placeInRow > this.placesInRow) throw new IllegalArgumentException("Incorrect place selected");

        if (hall[row-1][placeInRow-1] ==true) throw new IllegalArgumentException("This place is already selected: " + row + "," + placeInRow);
        hall[row-1][placeInRow-1] = true;
    }

    public int getPlacesReserved() {
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < placesInRow; j++) {
                if(hall[i][j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int getPlacesFree() {
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < placesInRow; j++) {
                if(!hall[i][j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "HallForSession{" +
                "row=" + row +
                ", placesInRow=" + placesInRow +
                ", hall=" + Arrays.toString(hall) +
                '}';
    }
}
