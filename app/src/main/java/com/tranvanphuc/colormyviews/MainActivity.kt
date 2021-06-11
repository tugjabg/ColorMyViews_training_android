package com.tranvanphuc.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number : Int = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_red.setOnClickListener {
            makeColorBackground().setBackgroundColor(Color.RED)
            chooseNumber()
        }
        button_yellow.setOnClickListener {
            makeColorBackground().setBackgroundColor(Color.YELLOW)
            chooseNumber()
        }
        button_green.setOnClickListener {
            makeColorBackground().setBackgroundColor(Color.GREEN)
            chooseNumber()
        }
    }
    private fun chooseNumber(){
        number++;
        if(number == 6){
            number = 1;
        }
    }
    private fun makeColorBackground() : TextView{
        when(number){
            1 -> return box_one
            2 -> return box_two
            3 -> return box_three
            4 -> return box_four
            5 -> return box_five
        }
        return box_four
    }
}