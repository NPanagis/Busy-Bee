package com.busybee.server.catalog.controller;

import com.busybee.server.catalog.model.Product;
import com.busybee.server.common.enums.ProductCategory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * CatalogController is the controller responsible for sending information about products to display on the catalog screen.
 */

@RestController
public class CatalogController {

    @RequestMapping(value = "/catalog/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1,"A4 Paper", "it's paper.", ProductCategory.OFFICE_SUPPLIES));
        products.add(new Product(2,"Cool Desk", "it's a cool desk.", ProductCategory.FURNITURE));
        return products;
    }

}
