package app.jobfindermw.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import app.jobfindermw.R
import app.jobfindermw.adapters.JobAdapter
import app.jobfindermw.databinding.FragmentBookmarksBinding
import app.jobfindermw.models.Job

class BookmarksFragment : Fragment() {

    private lateinit var binding : FragmentBookmarksBinding

    private lateinit var jobAdapter: JobAdapter

    private lateinit var jobs: ArrayList<Job>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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

        jobAdapter = JobAdapter(requireContext(), jobs)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentBookmarksBinding.inflate(layoutInflater, container, false)
        binding.fragment = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupJobRecycler()
    }

    private fun setupJobRecycler() {

        binding.bookmarkRecycler.apply {
            adapter = jobAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }
    }

}