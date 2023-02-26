package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.core.view.isVisible

class PremiumScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium_screen)

        val checkbox1 : CheckBox = findViewById(R.id.checkbox1)
        val checkbox2 : CheckBox = findViewById(R.id.checkbox2)
        val checkbox3 : CheckBox = findViewById(R.id.checkbox3)



        checkbox1.setOnClickListener {

            if (checkbox1.isChecked==true)
            {
                checkbox2.isChecked = false
                checkbox3.isChecked= false
            }

        }

        checkbox2.setOnClickListener {
            if (checkbox2.isChecked==true)
            {
                checkbox1.isChecked = false
                checkbox3.isChecked= false
            }
        }
        checkbox3.setOnClickListener {
            if (checkbox3.isChecked==true)
            {
                checkbox2.isChecked = false
                checkbox1.isChecked= false
            }

        }
    }

    fun btnPremium(view: View) {


    }




}