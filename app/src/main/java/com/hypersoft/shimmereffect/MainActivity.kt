package com.hypersoft.shimmereffect

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hypersoft.shimmera.ShimmeraColorBase
import com.hypersoft.shimmera.ShimmeraWithPlaceholder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val shimmeraImageView: ShimmeraColorBase = findViewById(R.id.smImgView)
       // val shimmeraImageView: ShimmeraWithPlaceholder = findViewById(R.id.smImgView)

        shimmeraImageView.loadImage("https://www.princetoncarbon.com/wp-content/uploads/2013/03/unicorn-wallpaper.jpg")
        // drawable
        //  shimmeraImageView.loadImage2(R.drawable.baseline_18_up_rating_24)
    }
}