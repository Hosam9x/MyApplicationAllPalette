package com.input.hosam.myapplication

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlin.concurrent.fixedRateTimer
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.BaseAdapter



class Main4Activity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener,RadioGroup.OnCheckedChangeListener ,CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {




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
    val list = ArrayList<Person>()

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
        /*
        var value = 0

        var fixedRT = fixedRateTimer(name = "hello-timer",
                initialDelay = 0, period = 100) {
            value++
            progressBar.progress = value
            if (value == 100)
            {
                fixedRT.cancel();
            }
        }
        */

        spinner.setOnItemSelectedListener(this)
            /*
        // Create an ArrayAdapter using a simple spinner layout and languages array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
        // Set layout to use when the list of choices appear
        // Set Adapter to Spinner
        spinner.setAdapter(aa)
        */
        list.add(Person("Fadel","Sabbagh"))
        list.add(Person("Hosam","Jessry"))
        list.add(Person("Omar","Sabbagh"))
        list.add(Person("Saher","Dawalibee"))
        spinner.adapter = CustomAdapter(this,R.layout.spinner_item_person,list)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        Toast.makeText(this,"user cancelled the spinner",Toast.LENGTH_LONG).show()
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, list.get(position).toString(), Toast.LENGTH_LONG).show()
        /*
        if (position == 2) {
            val intent = Intent(this, Main5Activity::class.java)
            intent.putExtra("key", 5)
            startActivity(intent)
        }
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


    inner class CustomAddapterr(context: Context, internal var mData: ArrayList<Person>) : BaseAdapter() {
        internal var inflator: LayoutInflater

        init {
            inflator = LayoutInflater.from(context)
        }

        override fun getCount(): Int {
            return mData.size
        }

        override fun getItem(position: Int): Any? {
            return null
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
            var convertView = convertView
                convertView = inflator.inflate(R.layout.spinner_item_person, null)
            val firstNameTextView = convertView.findViewById(R.id.firstNameTextView) as TextView
            val lastNameTextView = convertView.findViewById(R.id.lastNameTextView) as TextView
            var person = mData.get(position)
            firstNameTextView.text = person.name
            lastNameTextView.text = person.last
            return convertView
        }
    }


    class CustomAdapter(context: Context, var resource: Int, var objects: List<Person>) : ArrayAdapter<Person>(context, resource, objects) {

        var list = ArrayList<Person>()
        init
        {
            list = objects as ArrayList<Person>
        }

        private fun mySpinnerCustomView(position: Int, convertView: View?, parent: ViewGroup): View {
            //Getting the Layout Inflater Service from the system
            val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            //Inflating out custom spinner view
            val customView = layoutInflater.inflate(resource, parent, false)
            //Declaring and initializing the widgets in custom layout
            val imageView = customView.findViewById(R.id.icon) as ImageView
            val textView = customView.findViewById(R.id.firstNameTextView) as TextView
            val textView2 = customView.findViewById(R.id.lastNameTextView) as TextView
            //displaying the data
            //imageView.setImageResource(objects[position].getIcon())
            textView.setText(objects[position].name)
            textView2.setText(objects[position].last)
            return customView
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            return mySpinnerCustomView(position, convertView, parent)
        }

        override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            return mySpinnerCustomView(position, convertView, parent)
        }
    }
}
