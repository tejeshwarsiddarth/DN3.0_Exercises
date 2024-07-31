import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Alice", 250.0));
        orders.add(new Order(2, "Bob", 150.0));
        orders.add(new Order(3, "Charlie", 300.0));
        orders.add(new Order(4, "David", 200.0));

        // Using Bubble Sort
        List<Order> bubbleSortedOrders = new ArrayList<>(orders);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Using Quick Sort
        List<Order> quickSortedOrders = QuickSort.quickSort(orders);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
