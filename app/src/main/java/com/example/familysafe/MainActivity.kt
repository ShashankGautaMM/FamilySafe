package com.example.familysafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
       val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navbar)

        bottomNav.setOnItemSelectedListener{
         if (it.itemId == R.id.nav_guard){
             inflateFragment(GuardFragment.newInstance())
         }else if(it.itemId == R.id.nav_home){
             inflateFragment(HomeFragment.newInstance())

         }else if(it.itemId == R.id.nav_dashboard){
             inflateFragment(HomeFragment.newInstance())
         }else
             inflateFragment(ProfileFragment.newInstance())

           true
        }
    }

    private fun inflateFragment(newInstance: Fragment {
     val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.bottom_navbar,GuardFragment.newInstance())
        transaction.commit()
    }
}