package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.BookingI;
import com.cg.dto.BookingDto;
import com.cg.entities.Booking;

/****************************************
 * 
 * @author Bindhu Pandrangi
 *
 * Description : This is a class for service implementation for BusOperator, Bus, BusRoute entities.
 *
 */
@Service
public class BookingServiceImpl implements IBookingService {
	@Autowired
	BookingI ibooking;
	
	/*******************************************************
	 * Method : addBooking
	 * Description: Method is created to add new Bookings 
	 * Created Date: 21 April 2021
	 */
	
	@Transactional
	@Override
	public Booking addBooking(BookingDto bookingdto)
	{
		Booking booking = new Booking();
		booking.setDate(bookingdto.getDate());
		booking.setDestination(bookingdto.getDestination());
		booking.setSource(bookingdto.getSource());
		return ibooking.save(booking);
	}
}
