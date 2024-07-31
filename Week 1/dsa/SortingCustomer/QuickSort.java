import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Order> quickSort(List<Order> orders) {
        if (orders.size() <= 1) {
            return orders;
        }

        Order pivot = orders.get(orders.size() / 2);
        List<Order> left = new ArrayList<>();
        List<Order> middle = new ArrayList<>();
        List<Order> right = new ArrayList<>();

        for (Order order : orders) {
            if (order.getTotalPrice() < pivot.getTotalPrice()) {
                left.add(order);
            } else if (order.getTotalPrice() == pivot.getTotalPrice()) {
                middle.add(order);
            } else {
                right.add(order);
            }
        }

        List<Order> sortedOrders = new ArrayList<>();
        sortedOrders.addAll(quickSort(left));
        sortedOrders.addAll(middle);
        sortedOrders.addAll(quickSort(right));

        return sortedOrders;
    }
}
