package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel()
{
    //private property which can only be accessed from this class
    private val _count = mutableStateOf(0);

    //this public variable ensures that our private property is not exposed
    //to outside, only its value is
    val count : MutableState<Int> = _count

    fun increment()
    {
        _count.value++; //alter the private property directly
    }
    fun decrement()
    {
        _count.value--;
    }
}

