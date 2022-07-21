package broadcast;

import java.io.Serializable;

public class Interview implements BroadcastPart, Serializable {
    private final int length;

    private final String personName;

    public static Interview createInterviewInBroadcast(Broadcast broadcast, int length, String productName) {
        if (broadcast.getPaidContentLengthLimit() < length)
            throw new IllegalArgumentException("No paid content time left");
        if (broadcast.getLimit() < length)
            throw new IllegalArgumentException("No time left");
        broadcast.decreasePaidContentLimit(length);
        broadcast.decreaseLimit(length);
        return new Interview(length, productName);
    }

    private Interview(int length, String personName) {
        this.length = length;
        this.personName = personName;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public double getProfit() {
        double profitPerSecond = 0.5;
        return length * profitPerSecond;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "length=" + length +
                ", personName='" + personName + '\'' +
                '}';
    }
}
