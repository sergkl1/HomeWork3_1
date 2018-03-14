package task1;

/**
 * Created by sergey.kliepikov on 3/13/18.
 */
public class MusicRunner {
    public static void main(String[] args) {
        SongContent content = new SongContent(new byte[]{1,2,3});
        Song song1 = new Song("Thriller", "M. Jackson", "Pop", 240, content);
        Song song2 = new Song("Like a Prayer", "Madonna", "Pop", 200, content);
        Song song3 = new Song("Wind of Change", "Scorpions", "Pop", 250, content);

        Song song4 = new Song("Love the Way You Lie", "Eminem", "Rap", 250, content);
        Song song5 = new Song("Drop It Like It's hot", "Snoop Dog", "Rap", 300, content);
        Song song6 = new Song("Lose Yourself", "Eminem", "Rap", 180, content);

        Song song7 = new Song("Sharmanka", "Nick Baskov", "Pop", 200, content);


        Playlist playlist1 = new Playlist("Pop");
        Playlist playlist2 = new Playlist("Rap");
        Playlist playlist3 = new Playlist("Empty");


        User musicFan = new User("musicFan");

        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);

        playlist2.addSong(song4);
        playlist2.addSong(song5);
        playlist2.addSong(song6);

        musicFan.createPlaylist(playlist1);
        musicFan.createPlaylist(playlist2);
        musicFan.createPlaylist(new Playlist("Secret"));
        musicFan.createPlaylist(playlist3);

        musicFan.addSongToPlaylist("Secret", song7);
        musicFan.addSongToPlaylist("Secret", song1);

        System.out.println("Pop playlist length is " + playlist1.getTotalLength() + " seconds");
        System.out.println("Songs containing Lo: " + playlist2.findByTitlePart("Lo"));
        System.out.println("Eminem's songs: " + playlist2.findByAuthor("Eminem"));
        System.out.println("Find Rap playlist: " + musicFan.findByTitle("Rap"));
        System.out.println("User's Secret playlist: " + musicFan.findByTitle("Secret"));

    }
}
