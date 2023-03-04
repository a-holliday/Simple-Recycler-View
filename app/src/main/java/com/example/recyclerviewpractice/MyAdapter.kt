package com.example.recyclerviewpractice
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.data.DataSource
import com.example.recyclerviewpractice.model.Model


class MyAdapter (private val myDataset: List<Model>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
          //associate the text views to this viewholder
          val textView1 : TextView = view.findViewById(R.id.textView)
          val textView2 : TextView = view.findViewById(R.id.textView2)
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflate the layout to a view object
        //the parent is the ViewGroup RecyclerView
        //the attachToRoot is false because the RecyclerView will add the view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)

        return ViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = myDataset[position]
        holder.textView1.text = item.name
        holder.textView2.text = item.status

    }

    override fun getItemCount() = myDataset.size
}