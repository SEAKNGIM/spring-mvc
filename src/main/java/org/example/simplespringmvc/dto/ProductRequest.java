package org.example.simplespringmvc.dto;

import lombok.Data;
import lombok.ToString;


public record ProductRequest(String title,
                             String description,
                             float price,
                             String imageUrl
) {
}