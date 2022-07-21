package broadcast;

import java.io.Serializable;

public class Song implements BroadcastPart, Serializable {
    private final int length;

    private final String singerName;

    private final String songName;

    public static Song createSongIntoBroadcast(Broadcast broadcast, int length, String singerName, String songName) {
        if (broadcast.getLimit() < length)
            throw new IllegalArgumentException("No time left");
        broadcast.decreaseLimit(length);
        return new Song(length, singerName, songName);
    }

    private Song(int length, String singerName, String songName) {
        this.length = length;
        this.singerName = singerName;
        this.songName = songName;
    }

    @Override
    public double getProfit() {
        return 0;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return "Song{" +
                "length=" + length +
                ", singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }
}
