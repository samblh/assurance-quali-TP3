package org.example;

public interface ProductApiClient {
    Product getProduct(String productId) throws APIException , DateFormatException;
}

