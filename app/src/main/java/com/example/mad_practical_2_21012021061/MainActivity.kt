package com.example.mad_practical_2_21012021061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var TAG : String="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMsg("onCreate method is called")

    }
    override fun onStart(){
        super.onStart()
        showMsg("onCreate method is called")
    }
    override fun onResume(){
        super.onResume()
        showMsg("onResume method is called")
    }
    override fun onPause(){
        super.onPause()
        showMsg("onPause method is called")
    }
    override fun onStop(){
        super.onStop()
        showMsg("onStop method is called")
    }
    override fun onRestart(){
        super.onRestart()
        showMsg("onRestart method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMsg("onDestroy method is called")
    }

    private fun showMsg(msg:String){
        Log.i(TAG,"$msg")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }


}