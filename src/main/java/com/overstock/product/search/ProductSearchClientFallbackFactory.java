package com.overstock.product.search;

import com.overstock.product.search.model.ProductSearch;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jana on 7/5/2018.
 */
@Component
public class ProductSearchClientFallbackFactory implements FallbackFactory<ProductSearchClient> {

    @Override
    public ProductSearchClient create(Throwable throwable) {
        return new ProductSearchClient() {

            @Override
            public ProductSearch getProductSearch(String keywords, String format) {
                return new ProductSearch();
            }
        };
    }
}
