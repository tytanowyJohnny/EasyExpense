package com.example.easyexpense.data.database.expense

import androidx.lifecycle.Lifecycle
import com.example.easyexpense.data.expense.Expense


class ExpenseRepository private constructor(private val expenseDao: ExpenseDao) {


    fun getExpenses() = expenseDao.getExpenses()

    fun addExpense(expense: Expense) {

        expenseDao.insertExpense(expense)
    }

    companion object {

        @Volatile
        private var INSTANCE: ExpenseRepository? = null

        fun getInstance(expenseDao: ExpenseDao): ExpenseRepository =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: ExpenseRepository(expenseDao).also { INSTANCE = it }
            }
    }

}