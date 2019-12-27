package com.hotel.api.service;

import java.util.List;

import com.hotel.entity.Guest;

public interface IGuestService {

	void addGuest(Guest guest);

	Guest getGuest(long id);

	void deleteGuest(long id);

	List<Guest> getAll();



}
