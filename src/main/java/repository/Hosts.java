package repository;

import host.Host;

import java.util.ArrayList;
import java.util.List;

public class Hosts {
    private final List<Host> hostList = new ArrayList<>();

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
