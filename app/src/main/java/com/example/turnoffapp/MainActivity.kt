package com.example.turnoffapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.ComponentActivity
import androidx.core.view.forEach
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.example.turnoffapp.databinding.MainActivityBinding

class MainActivity : ComponentActivity() {

    lateinit var bindingClass: MainActivityBinding

    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = MainActivityBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickRB(view: View) {

        var tmp: RadioButton

        for (rb in bindingClass.rbGroup.referencedIds) {
            tmp = findViewById<RadioButton>(rb)
            if (rb != view.id && tmp.isChecked())
                tmp.setChecked(false)
        }
    }
}
