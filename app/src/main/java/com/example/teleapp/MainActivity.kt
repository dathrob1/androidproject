package com.example.teleapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun torecharge(view: View){
        val intent = Intent(this, RechargeActivity::class.java)
        startActivity(intent)
    }
    fun tocheckbalance(view: View){
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + Uri.encode("*804#")))
        startActivity(intent)
    }
    fun tobalancetransfer(view: View){
        val intent = Intent(this, BalancetransferActivity::class.java)
        startActivity(intent)
    }
    fun tocallmeback(view: View){
        val intent = Intent(this, CallmebackActivity::class.java)
        startActivity(intent)
    }
    fun tocredit(view: View){
        val intent = Intent(this, Credit2Activity::class.java)
        startActivity(intent)
    }



}