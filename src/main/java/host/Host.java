package host;

import broadcast.Broadcast;
import repository.Broadcasts;

public abstract class Host {
    private final String name;

    private final Broadcasts broadcasts;

    protected Host(String name, Broadcasts broadcasts) {
        this.name = name;
        this.broadcasts = broadcasts;
    }


    public boolean add(Broadcast broadcast) {
        return broadcasts.add(broadcast);
    }

    @Override
    public String toString() {
        return "Host{" +
                "name='" + name + '\'' +
                '}';
    }
}
