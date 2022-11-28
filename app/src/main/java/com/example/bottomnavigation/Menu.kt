package com.example.bottomnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_menu.gridLayout

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val cardTienda: CardView =  findViewById(R.id.cardTienda)
        val tiendaFragment = TiendaFragment()
        cardTienda.setOnClickListener{

            val fragment : Fragment? =
                supportFragmentManager.findFragmentByTag(TiendaFragment::class.java.simpleName)

            if(fragment !is TiendaFragment){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.conatiner_gg,tiendaFragment,TiendaFragment::class.java.simpleName)

                    .commit()
            }

        }




    }
}