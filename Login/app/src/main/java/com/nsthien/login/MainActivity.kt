package com.nsthien.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_login.setOnClickListener {
            if (tv_us.text.toString() != "" && tv_ph.text.toString() != "" && tv_add.text.toString() != ""){
            var i = Intent(this,ProfileActivity::class.java)
            i.putExtra("username",tv_us.text.toString())
            i.putExtra("phone",tv_ph.text.toString())
            i.putExtra("address",tv_add.text.toString())
                startActivity(i)
            }else{
            Toast.makeText(this, "Required enter input", Toast.LENGTH_LONG).show()
            }
        }
    }
}