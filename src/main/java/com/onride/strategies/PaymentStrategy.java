package com.onride.strategies;

import com.onride.entities.Payment;

public interface PaymentStrategy {

    static final Double PLATFORM_COMMISSION = 0.3;

    void processPayment(Payment payment);

}
