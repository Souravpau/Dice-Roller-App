package com.example.dicepicroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.button)
        button.setOnClickListener { rolldice() }
    }
    private fun rolldice(){
       val dice=Dice(6)
        val roll=dice.Roll()
        val diceImage:ImageView=findViewById(R.id.imageView)
      val toast=  Toast.makeText(this, "This is ${roll}", Toast.LENGTH_SHORT).show()
        when(roll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2-> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice (private val sides :Int){
    fun Roll():Int{
        return(1..6).random()
    }
}