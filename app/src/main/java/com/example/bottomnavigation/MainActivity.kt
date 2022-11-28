package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {
    private val perfilusuarioFragment = PerfilusuarioFragment()
    private  val tiendaFragment = TiendaFragment()
    private  val grifoFragment = GrifoFragment()
    private  val reporteFragment = ReporteFragment()
    private val inicioFragment = InicioFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){
                R.id.perfilusuario -> replaceFragment(perfilusuarioFragment)
                R.id.tienda-> replaceFragment(tiendaFragment)
                R.id.inicio -> replaceFragment(inicioFragment)
                R.id.grifo -> replaceFragment(grifoFragment)
                R.id.reporte -> replaceFragment(reporteFragment)

            }
            true
        }
        replaceFragment(inicioFragment)
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout,fragment)
            transaction.commit()
        }
    }
}