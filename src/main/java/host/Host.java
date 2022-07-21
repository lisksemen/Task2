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


    public String getName() {
        return name;
    }

    public Broadcasts getBroadcasts() {
        return broadcasts;
    }

    public boolean add(Broadcast broadcast) {
        return broadcasts.add(broadcast);
    }

    public Broadcast get(int index) {
        return broadcasts.get(index);
    }

    public void add(int index, Broadcast element) {
        broadcasts.add(index, element);
    }

    @Override
    public String toString() {
        return "Host{" +
                "name='" + name + '\'' +
                '}';
    }
}
