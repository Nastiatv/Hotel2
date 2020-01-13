package com.runa.hotel.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.runa.hotel.entities.Room;
import com.runa.hotel.enums.Status;

public class RoomDto extends ADto {

	private static final Logger logger = LoggerFactory.getLogger(RoomDto.class);

	private int capacity;
	private int dailyPrice;
	private Status status;

	public static List<RoomDto> convertList(List<Room> entities) {
		return entities.stream().map(RoomDto::new).collect(Collectors.toList());
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

	public String getStatus() {
	    return this.status.name();
	}

	public void setStatus(String status) {
	    this.status = Status.valueOf(status);
	}

	public RoomDto(Room room) {
		this.capacity = room.getCapacity();
		this.dailyPrice = room.getDailyPrice();
		this.status = Status.valueOf(room.getStatus());
	}

	public RoomDto() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RoomDto Number: ");
		sb.append(id);
		sb.append(" Capacity: ");
		sb.append(capacity);
		sb.append(" Daily price: ");
		sb.append(dailyPrice);
		sb.append(" Status: ");
		sb.append(status);
		String roomToString = sb.toString();
		logger.info(roomToString);
		return sb.toString();
	}
}
