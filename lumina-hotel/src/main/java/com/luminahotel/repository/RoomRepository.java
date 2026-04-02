package com.luminahotel.repository;

import com.luminahotel.model.Room;
import com.luminahotel.model.enums.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByStatus(RoomStatus status);

    List<Room> findByFloor(Integer floor);

    List<Room> findByCategoryId(Long categoryId);

    boolean existsByRoomNumber(String roomNumber);
}