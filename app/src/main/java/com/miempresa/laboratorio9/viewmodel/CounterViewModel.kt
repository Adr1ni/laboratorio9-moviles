package com.miempresa.laboratorio9.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class CounterViewModel {

    private val _counter = mutableStateOf(0)
    val counter: State<Int> = _counter

    fun add() {
        _counter.value++
    }
}