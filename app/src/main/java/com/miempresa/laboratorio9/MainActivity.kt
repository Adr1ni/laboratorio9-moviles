package com.miempresa.laboratorio9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.miempresa.laboratorio9.viewmodel.CounterViewModel
import com.miempresa.laboratorio9.views.Counter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vista = CounterViewModel()
        setContent {
            Counter(vista)
        }
    }
}

