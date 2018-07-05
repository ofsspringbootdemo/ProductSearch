package com.overstock.product.search.model;

import lombok.Data;

/**
 * Created by Jana on 7/5/2018.
 */
@Data
public class Product {
    private String id;
    private String name;
    private String shortName;
    private Urls urls;
    private Reviews reviews;
    private Pricing pricing;
}
