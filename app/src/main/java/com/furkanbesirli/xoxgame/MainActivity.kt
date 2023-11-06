package com.furkanbesirli.xoxgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.b1
import kotlinx.android.synthetic.main.activity_main.b2
import kotlinx.android.synthetic.main.activity_main.b3
import kotlinx.android.synthetic.main.activity_main.b4
import kotlinx.android.synthetic.main.activity_main.b5
import kotlinx.android.synthetic.main.activity_main.b6
import kotlinx.android.synthetic.main.activity_main.b7
import kotlinx.android.synthetic.main.activity_main.b8
import kotlinx.android.synthetic.main.activity_main.b9

class MainActivity : AppCompatActivity() {

    var player = "P1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            buttonClick((b1))
        }
        b2.setOnClickListener {
            buttonClick((b2))
        }
        b3.setOnClickListener {
            buttonClick((b3))
        }
        b4.setOnClickListener {
            buttonClick((b4))
        }
        b5.setOnClickListener {
            buttonClick((b5))
        }
        b6.setOnClickListener {
            buttonClick((b6))
        }
        b7.setOnClickListener {
            buttonClick((b7))
        }
        b8.setOnClickListener {
            buttonClick((b8))
        }
        b9.setOnClickListener {
            buttonClick((b9))
        }
    }

    fun buttonClick(button: Button){
        if (button.text=="") {
            if (player == "P1") {
                button.text = "X"
                player = "P2"
            } else {
                button.text = "0"
                player = "P1"
            }
            win()
        }
    }

    fun win(){
        if(b1.text == "X" && b2.text=="X" && b3.text=="X"){
            alertX()
        }
        if(b1.text == "O" && b2.text=="O" && b3.text=="O"){
            alertO()
        }

    }

    fun alertX(){
        var alertX = AlertDialog.Builder(this)
        alertX.setTitle("X WINS")
        alertX.setMessage("X WİNS PLAY AGAİN.?")
        alertX.setPositiveButton("YES"){dialog,which ->
            Toast.makeText(applicationContext,"reset", Toast.LENGTH_SHORT).show()
        }
        alertX.setNegativeButton("NOO") {dialog, which ->
            //NO
        }

        alertX.show()
    }

    fun alertO(){
        var alertO = AlertDialog.Builder(this)
        alertO.setTitle("O WINS")
        alertO.setMessage("O WİNS PLAY AGAİN.?")
        alertO.setPositiveButton("YES"){dialog,which ->
            Toast.makeText(applicationContext,"reset", Toast.LENGTH_SHORT).show()
        }
        alertO.setNegativeButton("NOO") {dialog, which ->
            //NO
        }

        alertO.show()
    }

}