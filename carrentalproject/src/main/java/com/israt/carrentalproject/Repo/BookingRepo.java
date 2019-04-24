package com.israt.carrentalproject.Repo;

import com.israt.carrentalproject.Entity.Booking;
import com.israt.carrentalproject.Entity.BookingSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Long> {
    List<Booking> findAllByReturnDateGreaterThanEqual(Date today);

}
