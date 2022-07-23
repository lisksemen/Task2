package repository;

import host.Host;

import java.util.ArrayList;
import java.util.List;

public class Hosts {
    private static Hosts instance;

    public Host get(int index) {
        return hostList.get(index);
    }

    public int size() {
        return hostList.size();
    }

    private final List<Host> hostList = new ArrayList<>();

    public static Hosts getInstance() {
        if (instance == null)
            instance = new Hosts();
        return instance;
    }

    private Hosts() {

    }

    public void add(Host host) {
        hostList.add(host);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Hosts:\n");
        int i = 0;
        for (Host host : hostList) {
            result.append(++i).append(") ").append(host).append("\n");
        }
        return result + "";
    }
}
