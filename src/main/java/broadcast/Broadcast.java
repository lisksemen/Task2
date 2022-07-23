package broadcast;

import host.Host;

import java.io.Serializable;
import java.util.*;

public class Broadcast implements Serializable {
    static final long serialVersionUID = 112233445566L;
    private final int length;

    private final Host host;

    private int limit;

    private int paidContentLengthLimit;

    private final List<BroadcastPart> list = new ArrayList<>();

    public static Broadcast createBroadcast(int length, Host host) {
        if (length <= 0)
            throw new IllegalArgumentException("Length can not be " + length);
        return new Broadcast(length, host);
    }

    public void addPart(BroadcastPartType type, int length, String... params) {
        if (length <= 0)
            throw new IllegalArgumentException("Length can not be " + length);
        list.add(type.create(this, length, params));

    }

    public Host getHost() {
        return host;
    }

    public double getProfit() {
        double result = 0;
        for (BroadcastPart part : list) {
            result += part.getProfit();
        }
        return result;
    }

    private Broadcast(int length, Host host) {
        this.length = length;
        this.paidContentLengthLimit = length / 2;
        this.limit = length;
        this.host = host;
    }

    public int getLimit() {
        return limit;
    }

    public int getPaidContentLengthLimit() {
        return paidContentLengthLimit;
    }

    void decreasePaidContentLimit(int length) {
        if (paidContentLengthLimit - length < 0)
            throw new IllegalArgumentException();
        paidContentLengthLimit -= length;
    }
    void decreaseLimit(int length) {
        if (limit - length < 0)
            throw new IllegalArgumentException();
        limit -= length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Broadcast:\nLength = ").append(length).append("\n");
        if (list.isEmpty())
            return result.append("No broadcast parts") + "";
        for (BroadcastPart part : list) {
            result.append(part).append("\n");
        }
        result.append("Profit = ").append(getProfit()).append("\n");
        return result + "";
    }
}
