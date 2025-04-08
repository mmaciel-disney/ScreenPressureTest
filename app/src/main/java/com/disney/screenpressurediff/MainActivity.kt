package com.disney.screenpressurediff

import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var screenPressure: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        screenPressure = findViewById(R.id.tvScreenPressure)
    }

    /**
     * Update UI with the pressure value
     */
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        screenPressure.text = ev.pressure.toString()
        return super.dispatchTouchEvent(ev)
    }
}