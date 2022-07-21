package repository;

import host.Host;

import java.util.ArrayList;
import java.util.List;

public class Hosts {
    private final List<Host> hostList = new ArrayList<>();

    public int size() {
        return hostList.size();
    }

    public boolean isEmpty() {
        return hostList.isEmpty();
    }

    public void add(Host host) {
        hostList.add(host);
    }

    public Host get(int index) {
        return hostList.get(index);
    }

    public Host set(int index, Host element) {
        return hostList.set(index, element);
    }

    public void add(int index, Host element) {
        hostList.add(index, element);
    }

    public Host remove(int index) {
        return hostList.remove(index);
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
