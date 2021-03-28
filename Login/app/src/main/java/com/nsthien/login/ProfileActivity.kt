package com.nsthien.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        tv_name.text = ""+ intent.getStringExtra("username")
        tv_address.text = ""+ intent.getStringExtra("address")
        tv_phone.text = ""+ intent.getStringExtra("phone")


        btn_back.setOnClickListener {
            var back = Intent(this,MainActivity::class.java)
            startActivity(back)
        }

        btn_des.setOnClickListener {
            onDestroy()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}