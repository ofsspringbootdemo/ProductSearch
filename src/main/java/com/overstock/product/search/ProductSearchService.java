package com.overstock.product.search;

import com.overstock.product.search.model.ProductSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jana on 7/5/2018.
 */
@Service
public class ProductSearchService {

    @Autowired
    ProductSearchClient productSearchClient;

    public void setProductSearchClient(ProductSearchClient productSearchClient) {
        this.productSearchClient = productSearchClient;
    }

    public ProductSearch getProductSearch(String keywords, String format) {
        return productSearchClient.getProductSearch(keywords, format);
    }
}
