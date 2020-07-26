package com.example.pcr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    private  val gu=0
    private  val choki=1
    private  val pa=2


    override fun onCreate(savedInstanceState: Bundle?) {
        var myHand:Int=0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
//        TODO:じゃんけんのクラスわける


//        intentから渡された値をmyResultへ渡して表示を変える
        when(intent.getIntExtra("MY_HAND",0)){
            R.id.choice_gu ->{
                my_result.setImageResource(R.drawable.janken_gu)
                myHand=gu
            }
            R.id.choice_pa ->{
                my_result.setImageResource(R.drawable.janken_pa)
                myHand=pa
            }
            R.id.choice_choki ->{
                my_result.setImageResource(R.drawable.janken_choki)
                myHand=choki
            }
        }
        //   computerの手をrandomで選ぶ
        val enemyHand= (Math.random()*10).toInt()%3
        when (enemyHand){
            gu ->enemy_result.setImageResource(R.drawable.janken_gu)
            choki ->enemy_result.setImageResource(R.drawable.janken_choki)
            pa ->enemy_result.setImageResource(R.drawable.janken_pa)
        }
        //  勝ち負けあいこ時の演出
        when ((enemyHand - myHand +3 )%3){
            0 ->result_caption.setText(R.string.result_caption_draw)
            1 ->result_caption.setText(R.string.result_caption_win)
            2 ->result_caption.setText(R.string.result_caption_lose)
        }

        //      もう一度ボタンにfinishメソッド追加
//        TODO:intentにデータ渡して、移動に変更 or bindingで結果管理
        again_button.setOnClickListener{finish()}

    }
}