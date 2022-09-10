package com.example.chopsticks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val orderButton: Button = findViewById(R.id.orderBtn)
        val chkPizza:CheckBox=findViewById(R.id.pizzaBox)
        val chkBurger:CheckBox=findViewById(R.id.burgerBox)
        val chkPasta:CheckBox=findViewById(R.id.pastaBox)
        val chkBurrito:CheckBox=findViewById(R.id.burritoBox)
        val billAmt:TextView=findViewById(R.id.total)
        var totalBill=0
        chkPizza.setOnClickListener(View.OnClickListener{
            if (chkPizza.isChecked)
                totalBill+=200
            else
                totalBill-=200
            billAmt.setText("Total bill is Rs"+totalBill.toString())

        })
        chkBurger.setOnClickListener(View.OnClickListener{
            if (chkBurger.isChecked)
                totalBill+=175
            else
                totalBill-=175
            billAmt.setText("Total bill is Rs"+totalBill.toString())

        })
        chkPasta.setOnClickListener(View.OnClickListener{
            if (chkPasta.isChecked)
                totalBill+=250
            else
                totalBill-=250
            billAmt.setText("Total bill is Rs"+totalBill.toString())

        })
        chkBurrito.setOnClickListener(View.OnClickListener{
            if (chkBurrito.isChecked)
                totalBill+=150
            else
                totalBill-=150
            billAmt.setText("Total bill is Rs"+totalBill.toString())

        })
        orderButton.setOnClickListener {
            val intent = Intent(this, address::class.java)
            startActivity(intent)
        }
    }
}