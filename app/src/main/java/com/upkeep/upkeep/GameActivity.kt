package com.upkeep.upkeep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class GameActivity : AppCompatActivity() {
    public var health_number = 30
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val button_back = findViewById<Button>(R.id.button_back)
        button_back?.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val hp_change = findViewById<TextView>(R.id.hp_num)
        val add_life = findViewById<Button>(R.id.button_plus)
        add_life?.setOnClickListener(){
            health_number++
            hp_change?.text = health_number.toString()
        }

        val remove_life = findViewById<Button>(R.id.button_minus)
        remove_life?.setOnClickListener(){
            health_number--
            hp_change?.text = health_number.toString()
        }


    }
}