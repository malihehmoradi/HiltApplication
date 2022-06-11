package ir.malihemoradi.hiltapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import ir.malihemoradi.hiltapplication.R

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load main fragment here
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, MainFragment()).commit()

    }
}