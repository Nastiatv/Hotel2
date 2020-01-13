package com.runa.hotel.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="guests")
public class Guest extends AEntity{

	
private static final Logger logger =LoggerFactory.getLogger(Guest.class);
	
	public Guest(Long id) {
		this.id = id;
	}

	public Guest() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("GuestDao Id: ");
		sb.append(id);
		String guestToString=sb.toString();
		logger.info(guestToString);
		return sb.toString();
	}
}
