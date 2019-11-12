package com.ao.genericadapterrecyclerviewkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    //lateinit var recycler_view: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // recycler_view = findViewById<RecyclerView>(R.id.recyclerView)
        val list = listOf<Any>(
            Car("audi", Color.BLACK),
            Bus("Eicher", Color.BLUE),
            Bus("Benz", Color.BLACK),
            Car("Suzuki", Color.WHITE) ,
            Bus("Eicher", Color.BLUE),
            Bus("Benz", Color.BLACK),
            Car("Suzuki", Color.WHITE) ,
            Bus("Eicher", Color.BLUE),
            Bus("Benz", Color.BLACK),
            Car("Suzuki", Color.WHITE) ,
            Car("audi", Color.BLACK),
              Bus("Eicher", Color.BLUE),
              Bus("Benz", Color.BLACK)

        )





    val myAdapter = object : GenericAdapter<Any>(list) {
        override fun getViewHolder(view: View, ViewType: Int): RecyclerView.ViewHolder {

            return JavaViewHolderFactory.create(view,ViewType)
        }

        override fun getLayoutId(position: Int, obj: Any): Int {
            return when (obj) {
                is Car -> R.layout.car_layout
                is Bus -> R.layout.bus_layout
                else -> R.layout.car_layout
            }
        }

    }

        recyclerView.apply {
            layoutManager= LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter=myAdapter

        }
}


/*

    private fun addDataSet() {
        Log.e("Recyc","Add_Add")

        for (i in 0..50) {
            myArray.add("dddd")



        }
    }

    private fun initRecyclerView() {

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)

           viewAdapter =  RecyclerAdapter(myArray)
            adapter = viewAdapter

          //  viewAdapter.onItemClickListener?.onItemClick({})

            //viewAdapter.onItemClickListener = object :com.ao.mvvm.baseAdapterGenarc.BaseAdapter.OnItemClickListener{}

        }

    }

*/

}

