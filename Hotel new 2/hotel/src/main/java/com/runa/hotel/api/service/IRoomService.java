package com.runa.hotel.api.service;

import java.util.List;

import com.runa.hotel.api.dto.RoomDto;
import com.runa.hotel.entities.Room;

public interface IRoomService {

    List<RoomDto> getAllRooms();
    
    Room addRoom(RoomDto dto);

    Room getRoomById(Long id);

    void updateRoom(Long id, RoomDto dto);

    void deleteRoomById(Long id);
}