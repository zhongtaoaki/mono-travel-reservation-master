package com.example.msasample.mono.travelreservation.externalservices.hotel;

import org.springframework.stereotype.Service;

@Service
public interface HotelMicroService {

	HotelReservationOfHotelMS reserve(HotelApplicationInfoOfHotelMS hotelApplicationInfoOfHotelMS) throws Exception;

}
