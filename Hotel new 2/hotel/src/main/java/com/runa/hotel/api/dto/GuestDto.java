package com.runa.hotel.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.runa.hotel.entities.Guest;

public class GuestDto extends ADto {

	private static final Logger logger = LoggerFactory.getLogger(GuestDto.class);

	public GuestDto(Guest guest) {
		this.id = guest.getId();
	}

	public GuestDto() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("GuestDao Id: ");
		sb.append(id);
		String guestToString = sb.toString();
		logger.info(guestToString);
		return sb.toString();
	}

	public static List<GuestDto> convertList(List<Guest> all) {
		return all.stream().map(GuestDto::new).collect(Collectors.toList());
	}
}
