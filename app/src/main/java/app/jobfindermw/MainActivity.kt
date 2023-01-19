package app.jobfindermw

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import app.jobfindermw.databinding.ActivityMainBinding
import app.jobfindermw.ui.activities.OnBoardingActivity


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        startActivity(
            Intent(
                this@MainActivity,
                OnBoardingActivity::class.java
            )
        )

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)

        setupNavigation()
    }

    private fun setupNavigation() {

        val navigationView = binding.bottomNavigation
        val navigationController = findNavController(R.id.nav_host_fragment_content_main)

//        appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.bookmarksFragment, R.id.accountFragment))

        navigationView.setupWithNavController(navigationController)
//        setupActionBarWithNavController(navigationController, appBarConfiguration)
//


    }


}