package com.dbsrm.formallanguageandautomataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    var bottomNavigationView: BottomNavigationView? = null
    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView?.itemIconTintList = null
        bottomNavigationView?.setOnNavigationItemSelectedListener(this)
        bottomNavigationView?.selectedItemId = R.id.home
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                fm.beginTransaction().replace(R.id.container, home()).commit()
                return true
            }
            R.id.about -> {
                fm.beginTransaction().replace(R.id.container, about()).commit()
                return true
            }
        }
        return false
    }
}