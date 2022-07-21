package broadcast;

public interface BroadcastPartType {
    BroadcastPart create(Broadcast broadcast, int length, String... params);

    BroadcastPartType SONG = (Broadcast broadcast, int length, String... params)
            -> Song.createSongIntoBroadcast(broadcast, length, params[0], params[1]);

    BroadcastPartType ADVERTISEMENT = (Broadcast broadcast, int length, String... params)
            -> Advertisement.createAdvertisementInBroadCast(broadcast, length, params[0]);

    BroadcastPartType INTERVIEW = (Broadcast broadcast, int length, String... params)
            -> Interview.createInterviewInBroadcast(broadcast, length, params[0]);

}
