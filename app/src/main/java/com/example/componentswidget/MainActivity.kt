package com.example.componentswidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var imageView: ImageView
    private lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        ratingBar = findViewById(R.id.ratingBar)
        imageView = findViewById(R.id.imageView)

        val btnWebView: Button = findViewById(R.id.btnWebView)
        val btnRatingBar: Button = findViewById(R.id.btnRatingBar)
        val btnImageView: Button = findViewById(R.id.btnImageView)

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        btnWebView.setOnClickListener {
            webView.visibility = View.VISIBLE
            ratingBar.visibility = View.GONE
            imageView.visibility = View.GONE
            webView.loadUrl("https://developer.android.com/?hl=pt-br")
        }

        btnRatingBar.setOnClickListener {
            webView.visibility = View.GONE
            ratingBar.visibility = View.VISIBLE
            imageView.visibility = View.GONE
            ratingBar.rating = 3.5f
            ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
                Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
            }
        }

        btnImageView.setOnClickListener {
            webView.visibility = View.GONE
            ratingBar.visibility = View.GONE
            imageView.visibility = View.VISIBLE
            imageView.setImageResource(R.drawable.twitter_24)
            imageView.setOnClickListener {
                Toast.makeText(this, "ImageView clicado!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}