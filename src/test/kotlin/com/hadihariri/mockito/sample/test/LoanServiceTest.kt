package com.hadihariri.mockito.sample.test

import com.hadihariri.mockito.sample.LoanCalculator
import com.hadihariri.mockito.sample.LoanService
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.mockito.Mockito.*

class LoanServiceTest {


    @Test
    fun authoriseCustomerLoan() {
        val mockLoanCalculator = mock(LoanCalculator::class.java)
        `when`(mockLoanCalculator.calculateAmount(3)).thenReturn(300.0)
        val loanService = LoanService(LoanCalculator())
        val amount = loanService.authoriseCustomerLoan(3)
        assertEquals(300.0, amount)

    }
}