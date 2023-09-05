package Model;

import java.util.Date;

public class Product {
    private String ProductID;
    private String ProductName;
    private String UnitPrice;
    private String Quantity;
    private String Version;
    private String ProductManufacturingDate;

    public Product() {
    }

    public Product(String productID, String productName, String unitPrice, String quantity, String version, String productManufacturingDate) {
        ProductID = productID;
        ProductName = productName;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Version = version;
        ProductManufacturingDate = productManufacturingDate;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        UnitPrice = unitPrice;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getProductManufacturingDate() {
        return ProductManufacturingDate;
    }

    public void setProductManufacturingDate(String productManufacturingDate) {
        ProductManufacturingDate = productManufacturingDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductID='" + ProductID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", UnitPrice='" + UnitPrice + '\'' +
                ", Quantity='" + Quantity + '\'' +
                ", Version='" + Version + '\'' +
                ", ProductManufacturingDate=" + ProductManufacturingDate +
                '}';
    }
}
