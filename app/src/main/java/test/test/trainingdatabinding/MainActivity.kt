package test.test.trainingdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import test.test.trainingdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener {
            behaviorProgressBar()
        }

    }

    private fun behaviorProgressBar(){

        binding.apply {
            if (progressBar.visibility == View.INVISIBLE){
                progressBar.visibility = View.VISIBLE
                button.text = "STOP"
            }else{
                progressBar.visibility = View.INVISIBLE
                button.text = "START"
            }
        }

    }
}