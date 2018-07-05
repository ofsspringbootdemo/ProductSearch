package com.overstock.product.search;

import com.overstock.product.search.model.ProductSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jana on 7/5/2018.
 */
@RestController
public class ProductSearchController {

    @Autowired
    ProductSearchService productSearchService;

    public void setProductSearchService(ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }

    @GetMapping("/v1/search")
    public ProductSearch getProductSearch(@RequestParam("keywords") String keywords, @RequestParam("format") String format) {
        return productSearchService.getProductSearch(keywords, format);
    }
}
