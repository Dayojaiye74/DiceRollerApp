package com.dev_app.kotlindiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.imageViewDice)
        val button: Button = findViewById(R.id.btnDice)


        button.setOnClickListener(){
            Toast.makeText(this,"Dice Rolled", Toast.LENGTH_SHORT).show()
            diceFunc()
        }
    }
    //...
    private fun diceFunc(){
        val random = Random().nextInt(6) + 1
        val diceRes = when(random){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_two
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_four
            5 -> R.drawable.dice_five
            else -> R.drawable.dice_six
        }
        diceImage.setImageResource(diceRes)
    }
}
