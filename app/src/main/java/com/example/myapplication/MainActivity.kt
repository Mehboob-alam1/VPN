package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)












    }
    fun VpnAccelerator(view: View) {

        Toast.makeText(applicationContext,"Vpn Accelerator", Toast.LENGTH_SHORT).show()
        println("Vpn Accelerator")

    }


    fun AcceleratorNotification(view: View) {

        Toast.makeText(applicationContext, "Accelerator Notification", Toast.LENGTH_SHORT).show()
        println("Accelerator Notification")



    }

    fun SplitTunneling(view: View) {

        Toast.makeText(applicationContext, "Split Tunneling", Toast.LENGTH_SHORT).show()
        println("Split Tunneling")
    }

    fun NetSheild(view: View) {

        Toast.makeText(applicationContext, "Net Sheild", Toast.LENGTH_SHORT).show()
        println("Net Sheild")
    }

    fun KillSwitch(view: View) {

        Toast.makeText(applicationContext, "Kill Switch", Toast.LENGTH_SHORT).show()
        println("Kill Switch")
    }
}