package com.peerlender.lendingengine.domain.exceptions;

public class LoanApplicationNotFoundException extends RuntimeException{
    public LoanApplicationNotFoundException(long loanApplicationId) {
        super("Loan application with id : "+ loanApplicationId+ "was not found.");
    }
}
