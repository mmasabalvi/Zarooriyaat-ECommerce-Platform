package com.example.SDAproj.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.SDAproj.productListobj.productListObject;
@Service
public class CartService {
    public double calculateTotalPrice(List<productListObject> products) {
        return products.stream()
                .mapToDouble(productListObject::getSellingPrice)
                .sum();
    }
}

