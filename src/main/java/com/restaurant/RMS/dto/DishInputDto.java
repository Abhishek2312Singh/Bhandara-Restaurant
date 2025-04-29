package com.restaurant.RMS.dto;

import com.restaurant.RMS.enums.Category;
import lombok.Data;

@Data
public class DishInputDto {
    private String name;
    private Double price;
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
