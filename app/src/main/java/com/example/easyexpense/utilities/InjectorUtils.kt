package com.example.easyexpense.utilities

import android.content.Context
import com.example.easyexpense.data.database.expense.ExpenseDao
import com.example.easyexpense.data.database.expense.ExpenseDatabase
import com.example.easyexpense.data.database.expense.ExpenseRepository
import com.example.easyexpense.ui.dashboard.DashboardViewModelFactory

object InjectorUtils {


    fun provideDashboardViewModelFactory(context: Context): DashboardViewModelFactory {

        val expenseRepository = ExpenseRepository.getInstance(ExpenseDatabase.getInstance(context).expenseDao())

        return DashboardViewModelFactory(expenseRepository)

    }

}