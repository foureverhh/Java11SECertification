package sample;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class OrderProcess {
    private int topSize = 3;

    public String[] getTopOrders(String[] orderList, int topSize) {
        String[] topOrders = new String[topSize];
        for (int i = 0; i < topSize; i++) {
            topOrders[i] = orderList[i];
        }
        return topOrders;
    }

    public static void outTest() {
        System.out.println("hello");
    }
    public String[] getTopOrders(String[] orderList, int topSize, int totalOrders) {
        String[] topOrders = new String[topSize];
        for (int i = 0; i < topSize; i++) {
            topOrders[i] = orderList[i];
        }
        double topPercent = topSize / totalOrders;
        out(topPercent);
        return topOrders;
    }

    public static void out(Object o) {
        System.out.println(o.toString());
    }

    public static void main(String[] args) {
        String[] orderList = new String[] {"A", "B", "C", "D", "E"};
        int topSize = 3;
        OrderProcess orderProcess = new OrderProcess();
        String[] topList = orderProcess.getTopOrders(orderList,topSize);
        System.out.println(Arrays.toString(topList));
        System.out.println("----------------------------------");
        int totalOrders = 3;
        topList = orderProcess.getTopOrders(orderList,topSize,totalOrders);
        System.out.println(Arrays.toString(topList));
        // outTest();
    }
}
