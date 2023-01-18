package app.jobfindermw.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import app.jobfindermw.R
import app.jobfindermw.adapters.CategoryAdapter
import app.jobfindermw.databinding.FragmentHomeBinding
import app.jobfindermw.models.Category

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var categoryAdapter : CategoryAdapter

    private lateinit var categories: ArrayList<Category>

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

        categoryAdapter = CategoryAdapter(requireContext(), categories)
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
    }

    private fun setupCategoryRecycler(data: ArrayList<Category>){

        binding.categoryRecycler.apply {
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
    }

}