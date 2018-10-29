package com.dicodingindepe.simplemvp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dicodingindepe.simplemvp.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val name = intent.getStringExtra("name")
        textView.text = name
    }
}
