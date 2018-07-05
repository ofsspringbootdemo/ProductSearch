package com.overstock.product.search.model;

import lombok.Data;

import java.util.List;

/**
 * Created by Jana on 7/5/2018.
 */
@Data
public class ProductSearch {
    private String origin;
    private List<Product> products;
}
