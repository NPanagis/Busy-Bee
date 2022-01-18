package com.busybee.server.catalog.controller;

import com.busybee.server.catalog.model.Product;
import com.busybee.server.common.enums.ProductCategory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CatalogController is the controller responsible for sending information about products to display on the catalog screen.
 */

@RestController
public class CatalogController {

    @RequestMapping(value = "/catalog/product", method = RequestMethod.GET)
    public Product getProduct() {
        return new Product(1,"A4 Paper", "it's paper.", ProductCategory.OFFICE_SUPPLIES);
    }

}
