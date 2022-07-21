package broadcast;

import java.io.Serializable;
import java.util.*;

public class Broadcast implements Serializable {
    static final long serialVersionUID = 112233445566L;
    private final int length;

    private int limit;

    private int paidContentLengthLimit;

    private final List<BroadcastPart> list = new ArrayList<>();

    public static Broadcast createBroadcast(int length) {
        if (length <= 0)
            throw new IllegalArgumentException("Length can not be " + length);
        return new Broadcast(length);
    }

    public void addPart(BroadCastPartType type, int length, String... params) {
        if (length <= 0)
            throw new IllegalArgumentException("Length can not be " + length);
        list.add(type.create(this, length, params));

    }

    public double getProfit() {
        double result = 0;
        for (BroadcastPart part : list) {
            result += part.getProfit();
        }
        return result;
    }

    private Broadcast(int length) {
        this.length = length;
        this.paidContentLengthLimit = length / 2;
        this.limit = length;
    }

    public int getLength() {
        return length;
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
