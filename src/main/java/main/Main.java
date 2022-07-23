package main;


import broadcast.BroadcastPartType;
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
        runBroadcasts();
        runHosts();
    }

    private void runBroadcasts() {
        System.out.println("----------BROADCASTS----------");

        var broadcasts = Broadcasts.getInstance();

        Host host = InvitedHost.createHost("Alex", "Alex resume");
        Hosts.getInstance().add(host);
        var broadcast1 = Broadcast.createBroadcast(1000, host);
        broadcast1.addPart(BroadcastPartType.SONG, 600, "singer name", "song name");
        broadcast1.addPart(BroadcastPartType.ADVERTISEMENT, 100, "product name");
        broadcast1.addPart(BroadcastPartType.INTERVIEW, 200, "person name");
        broadcasts.add(broadcast1);

        var broadcast2 = Broadcast.createBroadcast(500, host);
        broadcast2.addPart(BroadcastPartType.SONG, 250, "singer name 2", "song name 2");
        broadcast2.addPart(BroadcastPartType.ADVERTISEMENT, 250, "product name 2");
        broadcasts.add(broadcast2);

        System.out.println("Listing:");
        System.out.println(broadcasts);

    }

    private void runHosts() {
        System.out.println("-------------HOSTS-------------");

        var hosts = Hosts.getInstance();

        Host host1 = RegularHost.createHost("Mike", 10);
        host1.add(Broadcasts.getInstance().get(0));
        hosts.add(host1);

        Host host2 = InvitedHost.createHost("Anna", "resume");
        hosts.add(host2);

        System.out.println("Listing:");
        System.out.println(hosts);

    }
}
