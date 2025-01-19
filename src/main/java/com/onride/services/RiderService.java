package com.onride.services;

import com.onride.dto.DriverDto;
import com.onride.dto.RideDto;
import com.onride.dto.RideRequestDto;
import com.onride.dto.RiderDto;
import com.onride.entities.Rider;
import com.onride.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    RideDto endRide(Long rideId);

    DriverDto rateRider(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
