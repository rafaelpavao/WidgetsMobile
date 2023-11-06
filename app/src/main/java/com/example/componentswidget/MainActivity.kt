package com.example.componentswidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var imageView: ImageView
    private lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        imageView = findViewById(R.id.imageView)
        ratingBar = findViewById(R.id.ratingBar)

        // Load a web page in the WebView
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.google.com/maps/place/University+of+the+Itaja%C3%AD+Valley,+Itaja%C3%AD+Campus/@-26.9161329,-48.6669037,17z/data=!3m1!4b1!4m6!3m5!1s0x94d8cb8842138761:0x648dbc8d0ef634c1!8m2!3d-26.9161329!4d-48.6643288!16s%2Fm%2F0cpbfty?entry=ttu")

        // Set an OnRatingBarChangeListener to respond to rating changes
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            // Do something with the rating value (e.g., display it)
            imageView.contentDescription = "Rating: $rating"
        }
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val webView: WebView = findViewById(R.id.webView)
//        val ratingBar: RatingBar = findViewById(R.id.ratingBar)
//        val imageView: ImageView = findViewById(R.id.imageView)
//
//        // Load a web page in the WebView
//        webView.settings.javaScriptEnabled = true
//        webView.loadUrl("https://developer.android.com/")
//
//        // Set an OnRatingBarChangeListener to respond to rating changes
//        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
//            // Do something with the rating value (e.g., display it)
//            imageView.contentDescription = "Rating: $rating"
//        }
//    }
}