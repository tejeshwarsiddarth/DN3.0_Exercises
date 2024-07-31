public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Coffee Maker", "Home Appliance"),
            new Product(4, "Book", "Books"),
            new Product(5, "Smartphone", "Electronics")
        };

        int targetId = 3;

        // Linear Search
        Product foundProductLinear = LinearSearch.linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + foundProductLinear);

        // Binary Search
        Product foundProductBinary = BinarySearch.binarySearch(products, targetId);
        System.out.println("Binary Search Result: " + foundProductBinary);
    }
}
