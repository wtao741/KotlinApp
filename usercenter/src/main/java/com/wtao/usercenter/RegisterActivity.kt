package com.wtao.usercenter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mBtregister.setOnClickListener {
            Toast.makeText(this,"Register",Toast.LENGTH_LONG).show()
        }
    }
}