package com.example.easyexpense.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.easyexpense.R
import com.example.easyexpense.data.expense.Expense
import com.example.easyexpense.utilities.InjectorUtils
import java.lang.StringBuilder

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initUI()
    }

    private fun initUI() {

        val factory = InjectorUtils.provideDashboardViewModelFactory(this)

        val viewModel = ViewModelProviders.of(this, factory)
            .get(DashboardViewModel::class.java)

        val stringBuilder = StringBuilder()


        viewModel.getExpenses().observe(this, Observer { expenses ->

            expenses.forEach { expense ->
                stringBuilder.append("${expense.name}\n\n")
            }
        })


        viewModel.addExpense(Expense( 0,"TEST", 2.0))

        println(stringBuilder.toString())

    }

}
