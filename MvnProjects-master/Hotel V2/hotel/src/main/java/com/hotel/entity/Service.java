package com.hotel.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hotel.enums.Status;

@Entity
@Table(name = "Service")
public class Service {

	private static final Logger logger = LoggerFactory.getLogger(Service.class);
	@Column(name = "id")
	@GeneratedValue(strategy = GeneratedType.IDENTITY)
	private int id;
	@Column(name = "dailyPrice")
	private int dailyPrice;
	@Column(name = "status")
	private Status status;
	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Service(int id, int dailyPrice, Status status, String name) {
		this.id = id;
		this.dailyPrice = dailyPrice;
		this.status = status;
		this.name = name;
	}

	public Service() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Service id: ");
		sb.append(id);
		sb.append(" Service name: ");
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