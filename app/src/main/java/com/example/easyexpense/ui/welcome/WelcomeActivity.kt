package com.example.easyexpense.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easyexpense.R
import com.example.easyexpense.ui.dashboard.DashboardActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)



        welcome_loginButton.setOnClickListener {

            val username = welcome_usernameEditText.text
            val password = welcome_passwordEditText.text

            /* First check if any anything was provided from user
            True: Start ExpenseList Activity
            False: Show appropriate warning message on UI
             */
            if(username!!.isNotEmpty() && password!!.isNotEmpty()) {

                if(username.toString() != "admin" || password.toString() != "12robak90")
                    Snackbar.make(welcomeRootView, R.string.welcome_snackbarBadCredentials, Snackbar.LENGTH_SHORT).show()
                else {

                    /*
                Intent: Dashboard Activity
                 */
                    val dashboardIntent = Intent(this, DashboardActivity::class.java)
                    startActivity(dashboardIntent)
                }

            } else {

                Snackbar.make(welcomeRootView, R.string.welcome_snackbarWarning, Snackbar.LENGTH_SHORT).show()
            }

        }

    }

}
