package com.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.Entity1.HotelEntity;
@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Integer>{
}