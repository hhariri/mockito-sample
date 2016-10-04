package com.hadihariri.mockito.sample


// TODO: And then do sample with delegation

class LoanService(val loanCalculator: LoanCalculator) {
    fun authoriseCustomerLoan(customerId: Int): Double {
        if (customerId != 0) {
            return loanCalculator.calculateAmount(customerId)
        }
        return 0.0
    }
}