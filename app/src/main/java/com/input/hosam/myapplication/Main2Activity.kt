package com.input.hosam.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var value = intent.extras.getInt("key")
        Toast.makeText(this,value.toString(), Toast.LENGTH_LONG).show()
    }
    fun gotoapp(view: View)
    {
        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent);
    }
}
