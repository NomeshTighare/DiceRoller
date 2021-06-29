package com.example.diceroller

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.media.MediaPlayer



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnroll: Button = findViewById(R.id.btngo)
        val ivface: ImageView = findViewById(R.id.ivface)
        
        val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
        ivface.startAnimation(anim)
        val player = MediaPlayer.create(this, R.raw.diceroll)

        btnroll.setOnClickListener {
            player.start()
            val randomNum = (1..6).random()
            val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
            ivface.startAnimation(anim)

            if (randomNum == 1)
            {
                ivface.setImageResource(R.drawable.dice1)
            }
            else if (randomNum == 2) {
                ivface.setImageResource(R.drawable.dice2)
            }
            else if (randomNum == 3) {
                ivface.setImageResource(R.drawable.dice3)
            }
            else if (randomNum == 4) {
                ivface.setImageResource(R.drawable.dice4)
            }
            else if (randomNum == 5) {
                ivface.setImageResource(R.drawable.dice5)
            }
            else
            {
                ivface.setImageResource(R.drawable.dice6)
            }
        }

    }
}