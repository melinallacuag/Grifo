package com.example.bottomnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Bienvanida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvanida)


        val logoEmpresa = AnimationUtils.loadAnimation(this,R.anim.logo_empresa)
        val imagenGrifo = AnimationUtils.loadAnimation(this,R.anim.imagen_grifo)
        val bienvenida = AnimationUtils.loadAnimation(this,R.anim.bienvenida)
        val fraseEmpresaTextView = AnimationUtils.loadAnimation(this,R.anim.frase_empresa)

        val bienvenidaTextView  = findViewById(R.id.textWelcome) as TextView
        val fraseTextView = findViewById(R.id.textpresent) as TextView
        val logoTexView = findViewById(R.id.imglogo) as ImageView
        val imagenTextView = findViewById(R.id.imggrifo) as ImageView

        bienvenidaTextView .startAnimation(bienvenida)
        fraseTextView .startAnimation(fraseEmpresaTextView)
        logoTexView.startAnimation(logoEmpresa)
        imagenTextView.startAnimation(imagenGrifo)
        carga()
    }
    fun carga(){
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }, 3000
        )
    }
}