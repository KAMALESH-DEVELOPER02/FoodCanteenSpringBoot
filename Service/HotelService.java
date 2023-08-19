package com.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.Entity1.HotelEntity;
import com.spring.Repository.HotelRepository;

@Service
public class HotelService {
public HotelRepository repo;
public List<HotelEntity> getAllHotels(){
	return repo.findAll();
}
}
