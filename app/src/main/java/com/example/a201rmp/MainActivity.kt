package com.example.a201rmp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var coordinatorLayout: CoordinatorLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coordinatorLayout = findViewById(R.id.coordinatorLayout)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            Snackbar.make(coordinatorLayout, "Кнопка 1 нажата", Snackbar.LENGTH_SHORT)
        }

        button2.setOnClickListener {
            val snackbar = Snackbar.make(coordinatorLayout, "Кнопка 2 нажата", Snackbar.LENGTH_SHORT)
            snackbar.setAction("ВЕРНУТЬ КАК БЫЛО?") {
                // Handle undo action
            }
            snackbar.show()
        }

        button3.setOnClickListener {
            val snackbar = Snackbar.make(coordinatorLayout, "Кнопка 3 нажата", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("ВЕРНУТЬ КАК БЫЛО?") {
                snackbar.dismiss()
            }
            snackbar.show()
        }
    }
}
