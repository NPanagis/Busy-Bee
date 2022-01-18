package com.busybee.server.catalog.model;

import com.busybee.server.common.enums.ProductCategory;

/**
 * The Product class is a view of all attributes of a single product item.
 */

public class Product {

    private int id;

    private String productName;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(int id, String productName, String productDescription, ProductCategory productCategory) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
