package com.spring.Entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Hotel_Dishes {
	@ManyToOne
	@JoinColumn(name="Id")
	private int Hotel_Id;
	private String Hotel_dish1;
	private String Hotel_dish2;
	private String Hotel_dish3;
	private String Hotel_dish4;
	private String Hotel_dish5;
	public Hotel_Dishes(int hotel_Id, String hotel_dish1, String hotel_dish2, String hotel_dish3, String hotel_dish4,
			String hotel_dish5) {
		super();
		Hotel_Id = hotel_Id;
		Hotel_dish1 = hotel_dish1;
		Hotel_dish2 = hotel_dish2;
		Hotel_dish3 = hotel_dish3;
		Hotel_dish4 = hotel_dish4;
		Hotel_dish5 = hotel_dish5;
	}
	public Hotel_Dishes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHotel_Id() {
		return Hotel_Id;
	}
	public void setHotel_Id(int hotel_Id) {
		Hotel_Id = hotel_Id;
	}
	public String getHotel_dish1() {
		return Hotel_dish1;
	}
	public void setHotel_dish1(String hotel_dish1) {
		Hotel_dish1 = hotel_dish1;
	}
	public String getHotel_dish2() {
		return Hotel_dish2;
	}
	public void setHotel_dish2(String hotel_dish2) {
		Hotel_dish2 = hotel_dish2;
	}
	public String getHotel_dish3() {
		return Hotel_dish3;
	}
	public void setHotel_dish3(String hotel_dish3) {
		Hotel_dish3 = hotel_dish3;
	}
	public String getHotel_dish4() {
		return Hotel_dish4;
	}
	public void setHotel_dish4(String hotel_dish4) {
		Hotel_dish4 = hotel_dish4;
	}
	public String getHotel_dish5() {
		return Hotel_dish5;
	}
	public void setHotel_dish5(String hotel_dish5) {
		Hotel_dish5 = hotel_dish5;
	}
	@Override
	public String toString() {
		return "Hotel_Dishes [Hotel_Id=" + Hotel_Id + ", Hotel_dish1=" + Hotel_dish1 + ", Hotel_dish2=" + Hotel_dish2
				+ ", Hotel_dish3=" + Hotel_dish3 + ", Hotel_dish4=" + Hotel_dish4 + ", Hotel_dish5=" + Hotel_dish5
				+ "]";
	}

}
