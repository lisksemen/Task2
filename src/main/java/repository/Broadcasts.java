package repository;

import broadcast.Broadcast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Broadcasts implements Serializable {
    static final long serialVersionUID = 1234567890L;
    private final List<Broadcast> list = new ArrayList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean add(Broadcast broadcast) {
        return list.add(broadcast);
    }

    public void clear() {
        list.clear();
    }

    public Broadcast get(int index) {
        return list.get(index);
    }

    public Broadcast set(int index, Broadcast element) {
        return list.set(index, element);
    }

    public void add(int index, Broadcast element) {
        list.add(index, element);
    }

    public Broadcast remove(int index) {
        return list.remove(index);
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
