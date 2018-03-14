package task1;

import java.util.ArrayList;

/**
 * Created by sergey.kliepikov on 3/13/18.
 */
public class Playlist {
    private final String title;
    private final ArrayList<Song> songs = new ArrayList();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public long getTotalLength() {
        long totalLength = 0;
        for (Song song : songs) {
            totalLength += song.getLength();
        }
        return totalLength;
    }

    public ArrayList<Song> findByTitlePart(String title) {
        ArrayList<Song> results = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().contains(title)) {
                results.add(song);
            }
        }
        return results;
    }

    public ArrayList<Song> findByAuthor(String author) {
        ArrayList<Song> results = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAuthor().equalsIgnoreCase(author)) {
                results.add(song);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
