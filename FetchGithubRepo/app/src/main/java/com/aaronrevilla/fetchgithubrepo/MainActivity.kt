package com.aaronrevilla.fetchgithubrepo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.aaronrevilla.fetchgithubrepo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var obj: AuxObj =  AuxObj(60000.00)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.repositoryHasIssues.text = "No it has not issues"
    }


    class AuxObj(milliseconds: Double){
        lateinit var timer : CountDownTimer

        init{
            timer = CountDownTimer(milliseconds,1000.00){

                public void onTick(long millisUntilFinished) {
                    mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    mTextField.setText("done!");
                }
            }.start();
        }
    }
}
