package com.example.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.databinding.FragmentGrifoBinding
import com.example.bottomnavigation.databinding.FragmentPerfilusuarioBinding


class GrifoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentGrifoBinding.inflate(layoutInflater)
        val facturaFragment = FacturaFragment()
        bind.cardFacturacion.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {

                replace(R.id.frame_layout,facturaFragment,GrifoFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        return bind.root
    }


}