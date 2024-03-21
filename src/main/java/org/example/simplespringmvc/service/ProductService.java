package org.example.simplespringmvc.service;

import org.example.simplespringmvc.dto.ProductRequest;
import org.example.simplespringmvc.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProduct(String productName);

    ProductResponse createProduct(ProductRequest productRequest);

    ProductResponse findProductByID(int id);

    void deleteProduct(int productId);

    ProductResponse updateProduct(int id, ProductRequest productRequest);

}
