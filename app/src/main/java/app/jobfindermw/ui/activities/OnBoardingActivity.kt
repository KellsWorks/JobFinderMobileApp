package app.jobfindermw.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import app.jobfindermw.R
import app.jobfindermw.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_on_boarding)
        binding.apply {
            activity = this@OnBoardingActivity
        }
    }

    fun getStarted(view: View){
        Toast.makeText(this, "Get started", Toast.LENGTH_LONG)
            .show()
    }
}