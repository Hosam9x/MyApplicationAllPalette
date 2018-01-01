package com.input.hosam.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    var numberOfCoffeeCups: Int = 0
    var numberOfCoffeeCupsTextView : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOfCoffeeCupsTextView = findViewById<TextView>(R.id.numberOfCoffeeCupsTextView)
    }

    fun plusOneAction(view: View)
    {
        numberOfCoffeeCups = numberOfCoffeeCups + 1
        numberOfCoffeeCupsTextView!!.text = numberOfCoffeeCups.toString()
    }

    fun minusOneAction(view: View)
    {
        numberOfCoffeeCups--
        numberOfCoffeeCupsTextView!!.text = numberOfCoffeeCups.toString()
    }

    fun totalOneAction(view: View)
    {
        var resultTextView = findViewById<TextView>(R.id.numberOfCoffeeCupsTextView)
        resultTextView.text = NumberFormat.getCurrencyInstance().format(5 * numberOfCoffeeCups)
    }

    fun gotonew(view: View)
    {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent);
    }
}
