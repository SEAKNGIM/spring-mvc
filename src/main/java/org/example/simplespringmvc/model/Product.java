package org.example.simplespringmvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int id;
    private String title;
    private String description;
    private float price;
    private String imageUrl;
}
