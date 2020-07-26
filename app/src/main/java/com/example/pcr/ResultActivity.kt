package com.example.pcr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
//        intentから渡された値をmyResultへ渡して表示を変える
        when(intent.getIntExtra("MY_HAND",0)){
            R.id.choice_gu -> my_result.setImageResource(R.drawable.janken_gu)
            R.id.choice_pa -> my_result.setImageResource(R.drawable.janken_pa)
            R.id.choice_choki -> my_result.setImageResource(R.drawable.janken_choki)
        }
    }
}