package repository;

import broadcast.Broadcast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Broadcasts implements Serializable {
    static final long serialVersionUID = 1234567890L;
    private final List<Broadcast> list = new ArrayList<>();

    public boolean add(Broadcast broadcast) {
        return list.add(broadcast);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Broadcast broadcast : list) {
            result.append(++i).append( ") ").append(broadcast).append("\n");
        }
        return result + "";
    }
}
