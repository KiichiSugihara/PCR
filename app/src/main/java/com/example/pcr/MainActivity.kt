package com.example.pcr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun clickPCRButton(view: View){
//        ResultActivity作成
        val intent = Intent(this,ResultActivity::class.java)
        startActivity(intent)
    }
}