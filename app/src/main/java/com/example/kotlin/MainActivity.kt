package com.example.kotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        mainEmailTxv.length()
        total()

        var i = {x:Int,y:Int -> x+y}
        var j : (Int, Int) -> Int = {x,y -> x+y}

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun total(){

        var a = 8
        var b = 2

        Log.i("a+b=","${plus(a,b)}")
        Log.i("a-b=","${sub(a,b)}")
        Log.i("a*b=","${mutl(a,b)}")
        Log.i("a/b=","${devide(a,b)}")
    }

    fun plus(a:Int , b:Int) : Int {

        return a+b
    }

    fun sub(a:Int , b:Int) : Int {

        return a-b
    }
    fun mutl(a:Int , b:Int) : Int {

        return a*b
    }
    fun devide(a:Int , b:Int) : Int {

        return a/b
    }
}


