package com.onride.strategies;


import com.onride.entities.Driver;
import com.onride.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);

}
