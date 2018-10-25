package com.euapps.deeplinker

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dismiss.setOnClickListener { finish() }
        open.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(urlString.text.toString())))
        }
    }
}
