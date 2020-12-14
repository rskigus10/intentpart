package com.merihmd.myapplication

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.merihmd.myapplication.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val  REQUEST_CODE = 100

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_profile.setOnClickListener {
            val simpleIntent =  Intent(this@MainActivity, profile::class.java)
            startActivity(simpleIntent)
        }

        btn_produk.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, Produk::class.java)
            startActivity(dataIntent)
        }

        btn_parcelable.setOnClickListener {
            val parcelIntent = Intent(this@MainActivity, Parcelable::class.java)
            val user = User("Meri Hamidah", "Teknik Informatika", "Tiga B")
            parcelIntent.putExtra(Parcelable.EXTRA_USER,user)
            startActivity(parcelIntent)
        }

        btn_implicit.setOnClickListener {
            val phoneNumber = "0895356137161"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
            intent.putExtra("sms_body","hello ggaess")
            startActivity(intent)
        }
        btn_result.setOnClickListener {
            val intent = Intent(this@MainActivity, Result::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 200){
            val color = data?.getStringExtra(Result.EXTRA_COLOR)
            view_result.setBackgroundColor(Color.parseColor(color))
        }
    }

}