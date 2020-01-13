package com.runa.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.runa.hotel.enums.Status;

@Entity
@Table(name = "services")
public class Service extends AEntity {

	private static final Logger logger = LoggerFactory.getLogger(Service.class);

	@Column(name = "daily_price")
	private Integer dailyPrice;
	@Column(name = "status")
	private Status status;
	@Column(name = "name")
	private String name;

	public Integer getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(Integer dailyPrice) {
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

	public Service(Integer dailyPrice, Status status, String name) {
		this.dailyPrice = dailyPrice;
		this.status = status;
		this.name = name;
	}

	public Service() {
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