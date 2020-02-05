package com.example.easyexpense.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.easyexpense.data.database.expense.ExpenseRepository

class DashboardViewModelFactory(private val expenseRepository: ExpenseRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DashboardViewModel(expenseRepository) as T
    }
}