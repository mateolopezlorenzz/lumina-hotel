package com.luminahotel.repository;

import com.luminahotel.model.Reservation;
import com.luminahotel.model.enums.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

    List<Reservation> findByClientId(UUID clientId);

    List<Reservation> findByStatus(ReservationStatus status);

    @Query("""
        SELECT COUNT(r) > 0 FROM Reservation r
        WHERE r.room.id = :roomId
        AND r.status NOT IN ('CANCELLED')
        AND r.checkIn < :checkOut
        AND r.checkOut > :checkIn
    """)
    boolean existsOverlappingReservation(
        @Param("roomId") Long roomId,
        @Param("checkIn") LocalDate checkIn,
        @Param("checkOut") LocalDate checkOut
    );
}