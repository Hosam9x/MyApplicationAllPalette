package com.input.hosam.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val firstFragment = BlankFragment()

        // In case this activity was started with special instructions from an
        // Intent, pass the Intent's extras to the fragment as arguments
        firstFragment.setArguments(intent.extras)

        // Add the fragment to the 'fragment_container' FrameLayout
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, firstFragment).addToBackStack(null).commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    fun GoToNextFragment(view: View)
    {
        Toast.makeText(this,"Move",Toast.LENGTH_LONG).show()
        // Create a new Fragment to be placed in the activity layout
        val firstFragment = BlankFragment2()

        // In case this activity was started with special instructions from an
        // Intent, pass the Intent's extras to the fragment as arguments
        firstFragment.setArguments(intent.extras)

        // Add the fragment to the 'fragment_container' FrameLayout
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, firstFragment).addToBackStack(null).commit()


    }
}
