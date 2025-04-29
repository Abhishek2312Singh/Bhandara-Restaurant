package com.restaurant.RMS.repository;

import com.restaurant.RMS.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
    public List<Dish> findByCategory(String category);
}
