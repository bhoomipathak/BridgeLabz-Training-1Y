
class Product {
    int productId;
    String productName;

    Product(int id, String name) {
        productId = id;
        productName = name;
    }

    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}

class ElectronicProduct extends Product {
    String brand;

    ElectronicProduct(int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }

    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase())
                || brand.toLowerCase().contains(keyword.toLowerCase());
    }
}