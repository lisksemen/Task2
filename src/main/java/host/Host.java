package host;

import broadcast.Broadcast;

import java.util.ArrayList;
import java.util.List;

public abstract class Host {
    private final String name;

    private final List<Broadcast> broadcasts = new ArrayList<>();

    protected Host(String name) {
        this.name = name;
    }


    public void add(Broadcast broadcast) {
        broadcasts.add(broadcast);
    }

    @Override
    public String toString() {
        StringBuilder broadcastsString = new StringBuilder();
        int i = 1;
        for (Broadcast broadcast : broadcasts) {
            broadcastsString.append(i++).append(". ").append(broadcast);
        }
        return "Host{" +
                "name='" + name + '\'' +
                '}' + "\n" +
                (broadcasts.isEmpty() ? "No broadcasts" : "Broadcasts of " + name + ":\n" + broadcastsString) +
                "\n";
    }
}
