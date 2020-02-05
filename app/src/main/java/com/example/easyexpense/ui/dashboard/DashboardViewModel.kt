package com.example.easyexpense.ui.dashboard

import androidx.lifecycle.ViewModel
import com.example.easyexpense.data.database.expense.ExpenseRepository
import com.example.easyexpense.data.expense.Expense

class DashboardViewModel(private val expenseRepository: ExpenseRepository) : ViewModel() {


    fun getExpenses() = expenseRepository.getExpenses()

    fun addExpense(expense: Expense) {
        expenseRepository.addExpense(expense)
    }

}