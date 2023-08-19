
package com.spring.Controller2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Entity2.Hotel_Dishes;
import com.spring.Service2.DishService;

@RestController
public class DishController {
@Autowired
public DishService ser;
@GetMapping("/GetDishes")
public List<Hotel_Dishes>getAllDishes(){
	return ser.getAllDishes();
}
@GetMapping("/GetHotelDishesByHotelId/{Hotel_Id}")
public List<Hotel_Dishes> getDishesByHotel(@PathVariable int Hotel_Id){
	return ser.getDishesByHotelId(Hotel_Id);
	
}
}




