package com.dbsrm.formallanguageandautomataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity(), ChipNavigationBar.OnItemSelectedListener {

    var bottomNavigationView: ChipNavigationBar? = null
    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView!!.setOnItemSelectedListener(this)
        bottomNavigationView!!.setItemSelected(R.id.home)
    }

    override fun onItemSelected(id: Int) {
        when (id) {
            R.id.home -> {
                fm.beginTransaction().replace(R.id.container, home()).commit()
            }
            R.id.about -> {
                fm.beginTransaction().replace(R.id.container, about()).commit()
            }
        }
    }
}