package com.spring.Service2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Entity1.HotelEntity;
import com.spring.Entity2.Hotel_Dishes;
import com.spring.Repository.HotelRepository;
import com.spring.Repository2.HotelDishRepository;

@Service
public class DishService {
@Autowired
public HotelDishRepository repos;
public List<Hotel_Dishes> getAllDishes(){
	return repos.findAll();
}
public List<Hotel_Dishes> getDishesByHotelId(Integer Hotel_Id){
	return (List<Hotel_Dishes>) repos.findById(Hotel_Id).get();
	
}
}
