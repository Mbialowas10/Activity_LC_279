package com.mbialowas.activity_lc_279

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TAG= "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d(TAG, "onCreate CALLED")

    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart got called")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume got called")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause got called")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop got called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart got called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy got called")
    }

}