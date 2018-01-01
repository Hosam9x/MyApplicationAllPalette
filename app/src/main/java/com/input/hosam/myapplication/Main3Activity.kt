package com.input.hosam.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast

class Main3Activity() : AppCompatActivity() {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


    }

    fun gototest_writinig(view: View) {
        val intent = Intent(this, test_writinig::class.java)
        startActivity(intent);
    }


    fun goto_rules_without_errors_button(view: View) {
        val intent = Intent(this, rules_without_errors_button::class.java)
        startActivity(intent);
    }


    fun gotoabout(view: View) {
        /*
        val intent = Intent(this, gotoabout::class.java)
        startActivity(intent);
        */
        //Toast.makeText(this, getString("Toast Mas"), Toast.LENGTH_LONG).show()
        var person = Person("Hosam","Jessry")
        Toast.makeText(this, person.getFullName(),Toast.LENGTH_LONG).show()
    }


    fun textmas(string: String) : String {
        return  string
    }



}
