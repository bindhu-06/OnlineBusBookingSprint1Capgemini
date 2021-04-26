package com.cg.dao;

import com.cg.entities.BusOperator;
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

	@Query("select (b.totalSeats*b.fare )from Bus b,BusRoute br where b.busRoute=br and  lower(br.routeName)=lower(:routeName)")
	public List<Float> findRevenueByBusRouteRouteName(@Param("routeName") String routeName);

	@Query("select (b.totalSeats*b.fare )from Bus b,BusRoute br,Booking bo where b.busRoute=br and lower(br.routeName)=lower(:routeName) and extract (month from bo.date)=:month")
	public List<Float> findMonthlyRevenueByBusRouteRouteName(@Param("routeName") String routeName,
			@Param("month") int month);

	@Query("select (b.totalSeats*b.fare )from Bus b,BusRoute br, Booking bo where b.busRoute=br and lower(br.routeName)=lower(:routeName) and bo.date=:date")
	public List<Float> getRevenueByBusRouteAndDate(@Param("routeName") String routeName,
			@Param("date") LocalDate date);

	@Query("select (b.totalSeats*b.fare )from Bus b,BusRoute br ,Booking bo where b.busRoute=br and lower(br.routeName)=lower(:routeName) and extract (year from bo.date)=:year")
	public List<Float> getYearlyRevenueByBusRoute(@Param("routeName") String routeName, @Param("year") int year);

}
