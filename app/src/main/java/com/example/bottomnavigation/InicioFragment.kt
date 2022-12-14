package com.example.bottomnavigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ReportFragment
import com.example.bottomnavigation.databinding.FragmentGrifoBinding
import com.example.bottomnavigation.databinding.FragmentInicioBinding


class InicioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentInicioBinding.inflate(layoutInflater)
        val tiendaFragment = TiendaFragment()
        val perfilusuarioFragment = PerfilusuarioFragment()
        val grifoFragment = GrifoFragment()
        val reportFragment = ReporteFragment()
        bind.cardTienda.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {

                replace(R.id.frame_layout,tiendaFragment,TiendaFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        bind.cardUsuario.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {

                replace(R.id.frame_layout,perfilusuarioFragment,PerfilusuarioFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        bind.cardGrifo.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {

                replace(R.id.frame_layout,grifoFragment,GrifoFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        bind.cardReporte.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {

                replace(R.id.frame_layout,reportFragment,ReportFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        return bind.root
    }




}