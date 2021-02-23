package br.com.cotemig.calculadora2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_ac.setOnClickListener {
            resultado.text = "0"
        }
        button1.setOnClickListener {
            resultado.text = "1"
        }
        button2.setOnClickListener {
            resultado.text = "2"
        }
        button3.setOnClickListener {
            resultado.text = "3"
        }
        button4.setOnClickListener {
            resultado.text = "4"
        }
        button5.setOnClickListener {
            resultado.text = "5"
        }
        button6.setOnClickListener {
            resultado.text = "6"
        }
        button7.setOnClickListener {
            resultado.text = "7"
        }
        button8.setOnClickListener {
            resultado.text = "8"
        }
        button9.setOnClickListener {
            resultado.text = "9"
        }
        button0.setOnClickListener {
            resultado.text = "0"
        }
    }
}