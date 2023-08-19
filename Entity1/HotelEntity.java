package com.spring.Entity1;

import jakarta.persistence.Entity;

@Entity
public class HotelEntity {
private int Id;
private String Hotel_Name;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getHotel_Name() {
	return Hotel_Name;
}
public void setHotel_Name(String hotel_Name) {
	Hotel_Name = hotel_Name;
}
public HotelEntity(int id, String hotel_Name) {
	super();
	Id = id;
	Hotel_Name = hotel_Name;
}
public HotelEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "HotelEntity [Id=" + Id + ", Hotel_Name=" + Hotel_Name + "]";
}

}