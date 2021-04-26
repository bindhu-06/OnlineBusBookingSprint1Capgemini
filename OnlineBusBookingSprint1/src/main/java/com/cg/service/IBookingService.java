package com.cg.service;

import org.springframework.stereotype.Service;
import com.cg.dto.BookingDto;
import com.cg.entities.Booking;

@Service
public interface IBookingService {
	public Booking addBooking(BookingDto bookingdto);
	

}
