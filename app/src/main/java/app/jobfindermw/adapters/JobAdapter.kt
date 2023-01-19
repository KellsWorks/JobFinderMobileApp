package app.jobfindermw.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.jobfindermw.R
import app.jobfindermw.models.Job

class JobAdapter(val context: Context, private val jobs: ArrayList<Job>) : RecyclerView.Adapter<JobAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val logo: ImageView = itemView.findViewById(R.id.companyLogo)
        val company: TextView = itemView.findViewById(R.id.companyName)
        val title: TextView = itemView.findViewById(R.id.jobPosition)
        val location: TextView = itemView.findViewById(R.id.jobLocation)
        val salary: TextView = itemView.findViewById(R.id.jobSalary)
        val duration: TextView = itemView.findViewById(R.id.jobDuration)
        val description: TextView = itemView.findViewById(R.id.jobDescription)



    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.model_job, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = jobs[position]

        holder.logo.setImageResource(itemsViewModel.logo)
        holder.company.text = itemsViewModel.company
        holder.title.text = itemsViewModel.title
        holder.location.text = itemsViewModel.location
        holder.salary.text = itemsViewModel.salary
        holder.duration.text = itemsViewModel.duration
        holder.description.text = itemsViewModel.description



    }

    override fun getItemCount(): Int {
        return jobs.size
    }

}