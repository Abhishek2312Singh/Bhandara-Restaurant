package com.restaurant.RMS.controller;

import com.restaurant.RMS.dto.DishInputDto;
import com.restaurant.RMS.dto.DishOutputDto;
import com.restaurant.RMS.service.DishService;
import com.restaurant.RMS.service.DishServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    DishService dishService;

    @GetMapping("/all")
    public ResponseEntity<List<DishOutputDto>> getAllDish(){
        return new ResponseEntity<>(dishService.getAllDish(),HttpStatusCode.valueOf(200));
    }
    @GetMapping
    public ResponseEntity<DishOutputDto> getDishById(@RequestParam Long id){
        return new ResponseEntity<>(dishService.getDishById(id),HttpStatusCode.valueOf(200));
    }
    @PostMapping
    public ResponseEntity<DishOutputDto> addDish(@RequestBody DishInputDto dishInputDto){
        System.out.println("Inside controller");
        return new ResponseEntity<>(dishService.addDish(dishInputDto),HttpStatusCode.valueOf(200));
    }
}
