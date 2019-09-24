package com.anand.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anand.homework.Fragments.mainmenu.mainmenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //supportFragmentManager.beginTransaction().replace(R.id.MainContainer,mainmenu()).commit()
    }
}
