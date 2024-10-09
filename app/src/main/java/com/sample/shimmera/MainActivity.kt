package com.sample.shimmera

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.shimmer.ShimmeraColorBase
import com.example.shimmer.ShimmeraWithPlaceholder

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

        shimmeraImageView.loadImage("https://ai-music-generator-app-bucket.s3.eu-central-1.amazonaws.com/ai_tune_explore_image_and_audio/model_images/atif_aslam.png")
        // drawable
        //  shimmeraImageView.loadImage2(R.drawable.baseline_18_up_rating_24)
    }
}