package com.example.pcr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private  val gu=0
    private  val choki=1
    private  val pa=2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
//        TODO:勝ち負けあいこ時の演出
//        TODO:じゃんけんのクラスわける
//        TODO:bindingで管理


//        intentから渡された値をmyResultへ渡して表示を変える
        when(intent.getIntExtra("MY_HAND",0)){
            R.id.choice_gu -> my_result.setImageResource(R.drawable.janken_gu)
            R.id.choice_pa -> my_result.setImageResource(R.drawable.janken_pa)
            R.id.choice_choki -> my_result.setImageResource(R.drawable.janken_choki)
        }
        //   computerの手をrandomで選ぶ
        when ((Math.random()*10).toInt()%3){
            gu ->enemy_result.setImageResource(R.drawable.janken_gu)
            choki ->enemy_result.setImageResource(R.drawable.janken_choki)
            pa ->enemy_result.setImageResource(R.drawable.janken_pa)
        }
        //      もう一度ボタンにfinishメソッド追加
        again_button.setOnClickListener{finish()}

    }
}