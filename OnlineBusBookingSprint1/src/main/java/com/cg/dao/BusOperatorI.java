package com.cg.dao;

import com.cg.entities.BusOperator;
import com.cg.entities.Booking;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface BusOperatorI extends JpaRepository<BusOperator, Integer> {

	public boolean existsByBusOperatorUsername(String busOperatorUsername);

	public BusOperator findByBusOperatorUsername(String busOperatorUsername);

	@Query("select sum(b.numberOfSeats*b.amountPaid )from Booking b,BusRoute br where lower(br.routeName)=lower(:routeName)")
	public List<Booking> findRevenueByBusRouteRouteName(@Param("routeName") String routeName);

	@Query("select sum(b.numberOfSeats*b.amountPaid )from Booking b,BusRoute br where lower(br.routeName)=lower(:routeName) and month(b.date)=:month")
	public List<Booking> findMonthlyRevenueByBusRouteRouteName(@Param("routeName") String routeName,
			@Param("month") int month);

	@Query("select sum(b.numberOfSeats*b.amountPaid )from Booking b,BusRoute br where lower(br.routeName)=lower(:routeName) and b.date=:date")
	public List<Booking> getRevenueByBusRouteAndDate(@Param("routeName") String routeName,
			@Param("date") LocalDate date);

	@Query("select sum(b.numberOfSeats*b.amountPaid )from Booking b,BusRoute br where lower(br.routeName)=lower(:routeName) and year(b.date)=:year")
	public List<Booking> getYearlyRevenueByBusRoute(@Param("routeName") String routeName, @Param("year") int year);

}
