package task1;

/**
 * Created by sergey.kliepikov on 3/13/18.
 */
public class Song {
    private final String title;
    private final String author;
    private final String genre;
    private final int length;
    private final SongContent content;

    public Song(String title, String author, String genre, int length, SongContent content) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.length = length;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    public SongContent getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                ", content=" + content +
                '}';
    }
}
