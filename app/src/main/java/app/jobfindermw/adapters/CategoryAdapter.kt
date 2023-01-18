package app.jobfindermw.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.jobfindermw.R
import app.jobfindermw.models.Category


class CategoryAdapter(val context: Context, private val categories: ArrayList<Category>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val icon: ImageView = itemView.findViewById(R.id.categoryIcon)
        val name: TextView = itemView.findViewById(R.id.categoryName)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.model_category, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = categories[position]

        holder.icon.setImageResource(itemsViewModel.icon)
        holder.name.text = itemsViewModel.title


    }

    override fun getItemCount(): Int {
        return categories.size
    }

}