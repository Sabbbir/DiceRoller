package com.sabbir.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_btn)
        rollButton.setOnClickListener{
            Toast.makeText(this,"LOL ROLL",Toast.LENGTH_LONG).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val randd = Random().nextInt(6)+1

val texxt: TextView = findViewById(R.id.textt)
        texxt.text = randd.toString()
        val drawableRsc = when(randd){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        val diceImg: ImageView = findViewById(R.id.dice_img)
        diceImg.setImageResource(drawableRsc)

    }

}