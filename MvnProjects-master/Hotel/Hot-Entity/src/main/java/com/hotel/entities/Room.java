package com.hotel.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hotel.enums.Status;

public class Room {

	private static final Logger logger =LoggerFactory.getLogger(Room.class);
	
	private int id;
	private int capacity;
	private int dailyPrice;
	private Status status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(int dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Room(int id, int capacity, int dailyPrice, Status status) {
		this.id = id;
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
		this.status = status;
	}

	public Room() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Room Number: ");
		sb.append(id);
		sb.append(" Capacity: ");
		sb.append(capacity);
		sb.append(" Daily price: ");
		sb.append(dailyPrice);
		sb.append(" Status: ");
		sb.append(status);
		String roomToString=sb.toString();
		logger.info(roomToString);
		return sb.toString();
	}

}
