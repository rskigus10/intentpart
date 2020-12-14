package com.merihmd.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.merihmd.myapplication.model.User
import kotlinx.android.synthetic.main.activity_parcelable.*
import kotlinx.android.synthetic.main.activity_produk.*

class Parcelable : AppCompatActivity() {
    companion object{
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        txt_nama.text = user.name
        txt_jurusan.text = user.jurusan
        txt_semester.text = user.semester

        btn_back.setOnClickListener {
            val backItem = Intent (this@Parcelable, MainActivity::class.java)
            startActivity(backItem)

        }
}
}