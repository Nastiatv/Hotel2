package com.runa.hotel.api.service;

import java.util.List;

import com.runa.hotel.api.dto.GuestDto;
import com.runa.hotel.entities.Guest;

public interface IGuestService {

	List<GuestDto> getAllGuests();

	Guest addGuest(GuestDto guestDto);

	Guest getGuestById(Long id);

	void deleteGuestById(Long id);

	void updateGuest(Long id, GuestDto guestDto);

}