package com.input.hosam.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout


class Main6Activity : AppCompatActivity() {

    data class MyData(var text:String, var image:Bitmap)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val _recyclerView: RecyclerView = findViewById(R.id.recyclerview)

        //_recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        _recyclerView.layoutManager = GridLayoutManager(this, 3)


        val items = ArrayList<MyData>()



        //adding some dummy data to the list

        items.add(MyData("text 1", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 2", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 3", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 4", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 5", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 6", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 8", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 1", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 2", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 3", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 4", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 5", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 6", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 8", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 1", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 2", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 3", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 4", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 5", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 6", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 8", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 1", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 2", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 3", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 4", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 5", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 6", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        items.add(MyData("text 7", BitmapFactory.decodeResource(resources, R.drawable.test_writinig2)))

        items.add(MyData("text 8", BitmapFactory.decodeResource(resources, R.drawable.test_writinig)))

        //creating our adapter

        val adapter = RecyclerViewAdapter(items)



        //now adding the adapter to recyclerview

        _recyclerView.adapter = adapter
    }


    class RecyclerViewAdapter(val list:ArrayList<MyData>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            return ViewHolder(v)
        }

        override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
            holder.bindItems(list[position])
        }

        //this method is giving the size of the list

        override fun getItemCount(): Int {
            return list.size
        }



        class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

            fun bindItems(data : MyData){

                val _textView: TextView = itemView.findViewById(R.id.textview)

                val _imageView: ImageView = itemView.findViewById(R.id.imageview)

                _textView.text = data.text

                _imageView.setImageBitmap(data.image)



                //set the onclick listener for the singlt list item

                itemView.setOnClickListener({
                    Log.e("ItemClicked", data.text)
                })

            }
        }
    }
}
