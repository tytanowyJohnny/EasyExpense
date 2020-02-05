package com.example.easyexpense.data.database.expense

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.easyexpense.data.expense.Expense


@Dao
interface ExpenseDao {


    @Query("SELECT * FROM Expenses")
    fun getExpenses(): LiveData<List<Expense>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertExpense(expense: Expense)


}