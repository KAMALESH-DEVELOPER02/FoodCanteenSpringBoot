package com.spring.Repository2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Entity2.Hotel_Dishes;

@Repository
public interface HotelDishRepository extends JpaRepository<Hotel_Dishes, Integer> {

}
