import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Inventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Product Name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double addPrice = scanner.nextDouble();
                    Product newProduct = new Product(addId, addName, addQuantity, addPrice);
                    inventory.addProduct(newProduct);
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Product Name (or press Enter to skip): ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new Quantity: ");
                    int updateQuantity = scanner.nextInt();
                    System.out.print("Enter new Price: ");
                    double updatePrice = scanner.nextDouble();
                    inventory.updateProduct(updateId, updateName.isEmpty() ? null : updateName, updateQuantity, updatePrice);
                    break;

                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    inventory.deleteProduct(deleteId);
                    break;

                case 4:
                    System.out.println("Inventory:");
                    System.out.println(inventory);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
