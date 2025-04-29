package com.restaurant.RMS.service;

import com.restaurant.RMS.dto.DishInputDto;
import com.restaurant.RMS.dto.DishOutputDto;
import com.restaurant.RMS.entity.Dish;
import com.restaurant.RMS.enums.Category;

import java.util.List;

public interface DishService {
    public List<DishOutputDto> getAllDish();
    public DishOutputDto getDishById(Long id);
    public DishOutputDto addDish(DishInputDto dishInputDto);
    public List<DishOutputDto> searchByCategory(Category category);
}
