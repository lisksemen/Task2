package broadcast;

import java.io.Serializable;

public class Advertisement implements BroadcastPart, Serializable {
    private final int length;

    private final String productName;

    public static Advertisement createAdvertisementInBroadCast(Broadcast broadcast, int length, String productName) {
        if (broadcast.getPaidContentLengthLimit() < length)
            throw new IllegalArgumentException("No paid content time left");
        if (broadcast.getLimit() < length)
            throw new IllegalArgumentException("No time left");
        broadcast.decreasePaidContentLimit(length);
        broadcast.decreaseLimit(length);
        return new Advertisement(length, productName);
    }

    private Advertisement(int length, String productName) {
        this.length = length;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public double getProfit() {
        double profitPerSecond = 5;
        return length * profitPerSecond;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "length=" + length +
                ", productName='" + productName + '\'' +
                '}';
    }
}
