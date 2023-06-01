package com.example.classwork_25_05_2023

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.classwork_25_05_2023.databinding.ItemTrucksBinding

class TrucksAdapter(
    private val truck_list: ArrayList<Truck>,

    var onClick:(Truck)->Unit

) : RecyclerView.Adapter<TrucksAdapter.TrucksViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrucksViewHolder {
        return TrucksViewHolder(
            ItemTrucksBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TrucksViewHolder, position: Int) {
        holder.onBind(truck_list[position])
        holder.itemView.setOnClickListener {
            onClick(truck_list[position])
        }
    }

    override fun getItemCount(): Int {
       return truck_list.size
    }

    inner class TrucksViewHolder (private val binding: ItemTrucksBinding)
        : RecyclerView.ViewHolder(binding.root){

        fun onBind(truck: Truck){
            binding.textView.text =truck.name
            binding.title.text=truck.title
            binding.textDescription.text=truck.description
            binding.textColor.text =truck.color
            binding.textSum.text = truck.sum.toString()

            Glide.with(binding.imageView).load(truck.image).into(binding.imageView)
        }

    }

}