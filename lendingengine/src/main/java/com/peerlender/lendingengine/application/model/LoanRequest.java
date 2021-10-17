package com.peerlender.lendingengine.application.model;

import lombok.Data;

import java.util.Objects;

@Data
public class LoanRequest {

    private final int amount;
    private final int repaymentDays;
    private final double interestRate;
}