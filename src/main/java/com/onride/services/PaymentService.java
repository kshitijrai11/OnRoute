package com.onride.services;

import com.onride.entities.Payment;
import com.onride.entities.Ride;
import com.onride.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);

}
