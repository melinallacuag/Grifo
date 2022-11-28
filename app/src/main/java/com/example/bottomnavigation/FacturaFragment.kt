package com.example.bottomnavigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigation.databinding.FragmentFacturaBinding
import com.example.bottomnavigation.databinding.FragmentGrifoBinding
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_factura.*


class FacturaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentFacturaBinding.inflate(layoutInflater)
        val galonesFragment = GalonesFragment()
        val solesFragment = SolesFragment()
        val operacionFacturacionFragment = OperacionFacturacionFragment()


        bind.btngalones.setOnClickListener {

            galonesFragment.show((activity as AppCompatActivity).supportFragmentManager,"shop")
        }
        bind.btnsoles.setOnClickListener {

            solesFragment.show((activity as AppCompatActivity).supportFragmentManager,"shop")
        }

        bind.btnfactura.setOnClickListener {

            operacionFacturacionFragment.show((activity as AppCompatActivity).supportFragmentManager,"shop")
        }

        return bind.root
    }



}