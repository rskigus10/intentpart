package com.merihmd.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    companion object{
        const val RESULT_CODE = 200
        const val EXTRA_COLOR = "extra_color"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        btn_result.setOnClickListener {
            if (rg_color.checkedRadioButtonId != 0) {
                var value = "#FFFFFF"
                when (rg_color.checkedRadioButtonId) {
                    R.id.rad_merah -> value = "#FF0000"
                    R.id.rad_hijau -> value = "#00FF00"
                    R.id.rad_biru -> value = "#0000FF"
                    R.id.rad_hitam -> value =  "#000000"

                }
                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_COLOR, value)
                setResult(200, resultIntent)
                finish()
            }
        }

    }
}