package com.runa.hotel.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.runa.hotel.entities.Service;
import com.runa.hotel.enums.Status;

public class ServiceDto extends ADto {

	private static final Logger logger = LoggerFactory.getLogger(ServiceDto.class);

	private int dailyPrice;

	private Status status;

	private String name;
	
	public static List<ServiceDto> convertList(List<Service> entities) {
		return entities.stream().map(ServiceDto::new).collect(Collectors.toList());
	}

	public int getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(int dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
	    return this.status.name();
	}

	public void setStatus(String status) {
	    this.status = Status.valueOf(status);
	}

	public ServiceDto(Service service) {
		this.id = service.getId();
		this.dailyPrice = service.getDailyPrice();
		this.status = Status.valueOf(service.getStatus());
		this.name = service.getName();
	}

	public ServiceDto() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ServiceDto id: ");
		sb.append(id);
		sb.append(" ServiceDto name: ");
		sb.append(name);
		sb.append(" Price = ");
		sb.append(dailyPrice);
		sb.append(" Status: ");
		sb.append(status);
		String serviceToString = sb.toString();
		logger.info(serviceToString);
		return sb.toString();
	}
}