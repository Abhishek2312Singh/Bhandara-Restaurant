package com.restaurant.RMS.service;

import com.restaurant.RMS.dto.DishInputDto;
import com.restaurant.RMS.dto.DishOutputDto;
import com.restaurant.RMS.entity.Dish;
import com.restaurant.RMS.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    DishRepository dishRepository;

    @Override
    public List<DishOutputDto> getAllDish() {
        List<DishOutputDto> dishOutputDtoList = new ArrayList<>();
        List<Dish> dishes = dishRepository.findAll();
        for(Dish dish : dishes){
            DishOutputDto dishOutputDto = new DishOutputDto();
            dishOutputDto.setId(dish.getId());
            dishOutputDto.setName((dish.getName()));
            dishOutputDto.setCategory(dish.getCategory());
            dishOutputDto.setPrice(dish.getPrice());

            dishOutputDtoList.add(dishOutputDto);
        }
        return dishOutputDtoList;
    }

    @Override
    public DishOutputDto getDishById(Long id) {
        DishOutputDto dishOutputDto = new DishOutputDto();
        Dish dish = dishRepository.findById(id).orElse(null);
        dishOutputDto.setId(dish.getId());
        dishOutputDto.setName(dish.getName());
        dishOutputDto.setCategory(dish.getCategory());
        dishOutputDto.setPrice(dish.getPrice());
        return dishOutputDto;
    }

    @Override
    public DishOutputDto addDish(DishInputDto dishInputDto) {
        System.out.println("Inside Service");
        Dish dish = new Dish();
        dish.setName(dishInputDto.getName());
        dish.setCategory(dishInputDto.getCategory());
        dish.setPrice(dishInputDto.getPrice());

        dish = dishRepository.save(dish);
        System.out.println("Dish saved in DB!");
        DishOutputDto dishOutputDto = new DishOutputDto();

        dishOutputDto.setId(dish.getId());
        dishOutputDto.setName(dish.getName());
        dishOutputDto.setCategory(dish.getCategory());
        dishOutputDto.setPrice(dish.getPrice());
        return dishOutputDto;
    }
}
