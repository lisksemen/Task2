package main;


import broadcast.BroadCastPartType;
import broadcast.Broadcast;
import host.Host;
import host.InvitedHost;
import host.RegularHost;
import repository.Broadcasts;
import repository.Hosts;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Broadcasts broadcasts = runBroadcasts();
        runHosts(broadcasts);
    }

    private Broadcasts runBroadcasts() {
        System.out.println("----------BROADCASTS----------");

        var broadcasts = new Broadcasts();

        var broadcast1 = Broadcast.createBroadcast(1000);
        broadcast1.addPart(BroadCastPartType.SONG, 600, "singer name", "song name");
        broadcast1.addPart(BroadCastPartType.ADVERTISEMENT, 100, "product name");
        broadcast1.addPart(BroadCastPartType.INTERVIEW, 200, "person name");
        broadcasts.add(broadcast1);

        var broadcast2 = Broadcast.createBroadcast(500);
        broadcast2.addPart(BroadCastPartType.SONG, 250, "singer name 2", "song name 2");
        broadcast2.addPart(BroadCastPartType.ADVERTISEMENT, 250, "product name 2");
        broadcasts.add(broadcast2);

        System.out.println("Listing:");
        System.out.println(broadcasts);

        return broadcasts;
    }

    private void runHosts(Broadcasts broadcasts) {
        System.out.println("-------------HOSTS-------------");

        var hosts = new Hosts();

        Host host1 = RegularHost.createHost("Mike", broadcasts, 10);
        hosts.add(host1);

        Host host2 =  InvitedHost.createHost("Alex", broadcasts, "resume");
        hosts.add(host2);

        System.out.println("Listing:");
        System.out.println(hosts);

    }
}
