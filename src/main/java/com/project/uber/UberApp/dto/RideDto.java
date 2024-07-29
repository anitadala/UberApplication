package com.project.uber.UberApp.dto;


import com.project.uber.UberApp.entities.Rider;
import com.project.uber.UberApp.entities.enums.PaymentMethod;
import com.project.uber.UberApp.entities.enums.RideRequestStatus;

import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {
    private Long id;


    private Point pickupLocation;


    private Point dropOffLocation;


    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private RideRequestStatus status;

    private PaymentMethod paymentMethod;
}
