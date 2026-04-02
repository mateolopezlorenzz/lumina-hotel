package com.luminahotel.repository;

import com.luminahotel.model.RoomBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RoomBlockRepository extends JpaRepository<RoomBlock, Long> {

    List<RoomBlock> findByRoomId(Long roomId);

    @Query("""
        SELECT COUNT(b) > 0 FROM RoomBlock b
        WHERE b.room.id = :roomId
        AND b.startDate < :checkOut
        AND b.endDate > :checkIn
    """)
    boolean existsOverlappingBlock(
        @Param("roomId") Long roomId,
        @Param("checkIn") LocalDate checkIn,
        @Param("checkOut") LocalDate checkOut
    );
}