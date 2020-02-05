package com.example.easyexpense.data.expense

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "Expenses")
data class Expense(@PrimaryKey(autoGenerate = true)
                   var id: Int,
                   @ColumnInfo(name = "name")
                   val name: String,
                   @ColumnInfo(name = "value")
                   val value: Double) {

// TODO: Add dates to each expense

}