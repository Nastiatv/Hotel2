package com.hotel.entity;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hotel.enums.Status;

public class RoomHistory {

private static final Logger logger=LoggerFactory.getLogger(RoomHistory.class);
	
	private int id;
	private Room room;
	private Guest guest;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private List<Service> services;
	private Status status;
	private int serviceFee;

	
	public RoomHistory() {
	}

	public RoomHistory(int id) {
		this.id = id;
	}
	
	public RoomHistory(int id, Room room, Guest guest, LocalDate checkInDate) {
		this.id = id;
		this.room=room;
		this.guest=guest;
		this.checkInDate=checkInDate;
	}


	public int getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(int serviceFee) {
		this.serviceFee = serviceFee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
			sb.append("Room id: ");
			sb.append(room.getId());
			sb.append(" Guest id: ");
			sb.append(guest.getId());
			sb.append(". checkInDate: ");
			sb.append(checkInDate);
			sb.append(". checkOutDate: ");
			sb.append(checkOutDate);
			sb.append(". Services: ");
			sb.append(services);
			String roomHistoryToString=sb.toString();
			logger.info(roomHistoryToString);
			return sb.toString();
		
	}
}

