package org.mau.model;

public class Product {
    String product_id;
    String product_name;
    String supplier_name;
    String base_price;
    String quantity;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Product() {

    }

    public Product(String name, String supplier, String price) {
        this.product_name = name;
        this.supplier_name = supplier;
        this.base_price = price;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getBase_price() {
        return base_price;
    }

    public void setBase_price(String base_price) {
        this.base_price = base_price;
    }

    public String toString() {

        return String.format("%S Pris %SKR Antal på lager: %S Leverantör %S",product_name,base_price,quantity,supplier_name);
    }
}
