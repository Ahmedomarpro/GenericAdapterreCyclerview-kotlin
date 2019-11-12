package com.ao.genericadapterrecyclerviewkotlin

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.car_layout.view.*

object JavaViewHolderFactory {


    fun create(view: View, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.car_layout -> CarViewHolder(view)
            R.layout.bus_layout -> BusViewHolder(view)
            else -> {
                CarViewHolder(view)
            }
        }
    }

  /*  internal inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        GenericAdapter.Binder<Car> {

        var textView: TextView

        init {
            textView = itemView.findViewById(R.id.carName)
        }

        override fun bind(car: Car) {
            textView.text = car.name
        }
    }

    internal inner class BusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        GenericAdapter.Binder<Bus> {

        var textView: TextView

        init {
            textView = itemView.findViewById(R.id.busName)
        }

        override fun bind(bus: Bus) {
            textView.text = bus.name
        }
    }

*/

    internal   class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),GenericAdapter.Binder<Car> {
        var textView : TextView
        init {
            textView = itemView.carName

         }
        override fun bind(data: Car) {
          }
    }
    internal   class BusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        GenericAdapter.Binder<Bus> {

        var textView: TextView

        init {
            textView = itemView.findViewById(R.id.busName)
        }

        override fun bind(bus: Bus) {
            textView.text = bus.name
        }
    }


}