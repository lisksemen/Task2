package broadcast;

public interface BroadCastPartType {
    BroadcastPart create(Broadcast broadcast, int length, String... params);

    BroadCastPartType SONG = (Broadcast broadcast, int length, String... params)
            -> Song.createSongIntoBroadcast(broadcast, length, params[0], params[1]);

    BroadCastPartType ADVERTISEMENT = (Broadcast broadcast, int length, String... params)
            -> Advertisement.createAdvertisementInBroadCast(broadcast, length, params[0]);

    BroadCastPartType INTERVIEW = (Broadcast broadcast, int length, String... params)
            -> Interview.createInterviewInBroadcast(broadcast, length, params[0]);

}
