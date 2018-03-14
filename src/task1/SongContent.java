package task1;

import java.util.Arrays;

/**
 * Created by sergey.kliepikov on 3/13/18.
 */
public class SongContent {
    private final byte[] content;

    public SongContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "SongContent{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
