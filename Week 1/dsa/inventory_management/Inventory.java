import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Added: " + product);
        }
    }

    public void updateProduct(int productId, String productName, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            if (productName != null) product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Updated: " + product);
        } else {
            System.out.println("No product found with ID " + productId);
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Deleted product with ID " + productId);
        } else {
            System.out.println("No product found with ID " + productId);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products.values()) {
            sb.append(product.toString()).append("\n");
        }
        return sb.toString();
    }
}
