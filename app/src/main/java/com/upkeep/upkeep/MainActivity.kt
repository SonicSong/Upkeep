package com.upkeep.upkeep

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

//Dark mode text color #ff9b48

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_start)
        button?.setOnClickListener() {
            val intent = Intent(this,GameActivity::class.java)
            startActivity(intent)
        }


    }
}


/*Some random bs
Toast.makeText(applicationContext, "I HATE IT GOD DAMN IT", Toast.LENGTH_LONG).show()
 */