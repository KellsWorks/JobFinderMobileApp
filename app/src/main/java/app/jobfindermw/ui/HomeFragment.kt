package app.jobfindermw.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import app.jobfindermw.R
import app.jobfindermw.adapters.CategoryAdapter
import app.jobfindermw.adapters.JobAdapter
import app.jobfindermw.databinding.FragmentHomeBinding
import app.jobfindermw.models.Category
import app.jobfindermw.models.Job

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var categoryAdapter : CategoryAdapter

    private lateinit var categories: ArrayList<Category>

    private lateinit var jobAdapter: JobAdapter

    private lateinit var jobs: ArrayList<Job>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        categories = ArrayList()
        categories.add(
            Category(
            "Human Resource",
            R.drawable.person
        ), )
        categories.add(
            Category(
                "Health & Medicine",
                R.drawable.help_buoy
            ), )
        categories.add(
            Category(
                "Sports",
                R.drawable.basketball
            ), )

        /*** Jobs array list */
        jobs = ArrayList()
        jobs.add(
            Job("Software Developer", "Airtel Malawi", R.drawable.airtel, "Lilongwe"
            ,"Grade D", "6 Months", "Applications are invited from highly qualified, self-motivated, and experienced candidates to fill the following vacant position at Castel Malawi"
            )
        )
        jobs.add(
            Job("Software Developer", "Airtel Malawi", R.drawable.airtel, "Lilongwe"
                ,"Grade D", "6 Months", "Applications are invited from highly qualified, self-motivated, and experienced candidates to fill the following vacant position at Castel Malawi"
            )
        )

        categoryAdapter = CategoryAdapter(requireContext(), categories)
        jobAdapter = JobAdapter(requireContext(), jobs)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        binding.apply {
            fragment = this@HomeFragment
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupCategoryRecycler(categories)
        setupJobRecycler(jobs)
    }

    private fun setupCategoryRecycler(data: ArrayList<Category>){

        binding.categoryRecycler.apply {
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
    }

    private fun setupJobRecycler(data: ArrayList<Job>){

        binding.jobRecycler.apply {
            adapter = jobAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }
    }

}