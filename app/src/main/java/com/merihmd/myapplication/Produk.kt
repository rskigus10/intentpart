package com.merihmd.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parcelable.*
import kotlinx.android.synthetic.main.activity_produk.*

class Produk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)


        btn_backproduk.setOnClickListener {
            val backItem = Intent (this@Produk, MainActivity::class.java)
            startActivity(backItem)

        }


    }
}