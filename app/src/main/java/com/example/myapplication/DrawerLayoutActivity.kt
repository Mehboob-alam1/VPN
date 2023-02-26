package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class DrawerLayoutActivity : AppCompatActivity() {

    lateinit var  toggle : ActionBarDrawerToggle



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer_layout)
        val  drawerLayout : DrawerLayout     = findViewById(R.id.drawerLAyout);
        val  navigationview : NavigationView = findViewById(R.id.navigationView);

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        supportActionBar?.setDisplayHomeAsUpEnabled(false);



        navigationview.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.setting -> Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()


                R.id.account -> Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()


                R.id.showlog -> Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()


                R.id.report -> Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()


                R.id.help -> Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()


                R.id.signout -> Toast.makeText(applicationContext,"this is toast message", Toast.LENGTH_SHORT).show()

            }
            true
        }

    }

}