package com.example.ed_08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ed_08.databinding.ActivityMainBinding
import com.example.ed_08.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tela.setOnClickListener {
            val voltarTelaPrincipal = Intent(this, MainActivity::class.java)
            startActivity(voltarTelaPrincipal)
        }
    }
}