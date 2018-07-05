package com.overstock.product.search;

import com.overstock.product.search.model.ProductSearch;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jana on 7/5/2018.
 */
@FeignClient(name="product-search", url="https://www.overstock.com", fallbackFactory = ProductSearchClientFallbackFactory.class)
public interface ProductSearchClient {

    @GetMapping("/search")
    public ProductSearch getProductSearch(@RequestParam("keywords") String keywords, @RequestParam("format") String format);
}
