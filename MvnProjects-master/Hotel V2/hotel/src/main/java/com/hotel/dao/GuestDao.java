package com.hotel.dao;

import java.util.ArrayList;
import java.util.List;

import com.hotel.api.dao.IGuestDao;
import com.hotel.entity.Guest;
@Repository
public class GuestDao implements IGuestDao {

	@PersistenceContext
	protected EntityManager entityManager;// from javax.persistence

	@Override
	public Guest create(Guest guest) {
		entityManager.persist(guest);
		return guest;
	}

	@Override
	public Guest get(Guest guest) {
		return entityManager.find(guest, id);
	}

	@Override
	public Guest update(Guest guest) {
		entityManager.merge(guest);
		entityManager.flush();
	}
	
	@Override
	public Guest delete(Guest guest) {
		entityManager.remove(guest);
		}

	private List<Guest> guestInHotel = new ArrayList<>();

	private static GuestDao guestDao;

	public static GuestDao getInstance() {
		if (guestDao == null) {
			guestDao = new GuestDao();
		}
		return guestDao;
	}

	@Override
	public void addGuestToList(Guest guest) {
		guestInHotel.add(guest);
	}

	@Override
	public Guest getGuestFromList(int id) {
		return guestInHotel.get(id);
	}

	@Override
	public void deleteGuestFromList(int id) {
		guestInHotel.remove(id);
	}

	@Override
	public List<Guest> getAllListGuests() {
		return guestInHotel;
	}
}
