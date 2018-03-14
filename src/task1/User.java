package task1;

import java.util.ArrayList;

/**
 * Created by sergey.kliepikov on 3/13/18.
 */
public class User {
    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public Playlist findByTitle(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equalsIgnoreCase(name)) {
                return playlist;
            }
        }
        return null;
    }

    public void addSongToPlaylist(String name, Song song) {
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().equalsIgnoreCase(name)) {
                playlist.addSong(song);
            }
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
