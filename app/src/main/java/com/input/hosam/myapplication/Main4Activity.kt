package com.input.hosam.myapplication

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Main4Activity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener,RadioGroup.OnCheckedChangeListener ,CompoundButton.OnCheckedChangeListener {
    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        //TODO finish this
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        textViewSB.text = progress.toString()
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        asdasd(checkedId)
    }

    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var checkBox3: CheckBox
    lateinit var textViewR: TextView
    lateinit var textViewSB: TextView
    var text = ""

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        val textview = findViewById<TextView>(R.id.textView)
        if (checkBox1.isChecked) {
            text = text + checkBox1.text + ","
        }
        if (checkBox2.isChecked) {
            text = text + checkBox2.text + ","
        }
        if (checkBox3.isChecked) {
            text = text + checkBox3.text + ","
        }
        if (text.length > 0) {
            text = text.substring(0, text.length - 1)
        }
        textview.text = text
    }


    fun asdasd(checkedId: Int) {
        if (checkedId == R.id.rdApple) {
            textViewR.text = "Apple"
        } else if (checkedId == R.id.rdBanana) {
            textViewR.text = "Banana"
        } else if (checkedId == R.id.rdOrange) {
            textViewR.text = "Orange"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        textViewSB = findViewById<TextView>(R.id.textViewSB)
        var seekBar = findViewById<SeekBar>(R.id.seekBar)
        seekBar.setOnSeekBarChangeListener(this)
        textViewSB.text = seekBar.progress.toString()

        textViewR = findViewById<TextView>(R.id.textViewR)
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener(this)
        asdasd(radioGroup.checkedRadioButtonId)
        checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->
            buttonView.isChecked = true
        }

        //checkBox1.setOnCheckedChangeListener(this)

        checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        //checkBox2.setOnCheckedChangeListener(this)

        checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        //checkBox3.setOnCheckedChangeListener(this)

        /*
        var checkBox = findViewById<CheckBox>(R.id.checkBox1)

        checkBox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ compoundButton: CompoundButton, b: Boolean ->

        })


        */
    }

    fun GotoNextActivity(view: View)
    {
        /*

val browse = Intent(Intent.ACTION_VIEW, Uri.parse("https://stackoverflow.com/questions/45518139/kotlin-android-start-new-activity"))
startActivity(browse)
*/

val intent = Intent(this, Main5Activity::class.java)
intent.putExtra("key", 5)
startActivity(intent)
    }

}
