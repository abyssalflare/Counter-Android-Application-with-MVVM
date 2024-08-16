package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//The viewmodel is responsible for taking data from the model and presenting it to the view
class CounterViewModel() : ViewModel()
{
    //private property which can only be accessed from this class
    //create a variable which gets the data from our Model API
    //WHY do we need to create variables and functions here instead of just using them
    //directly from the Model API? because the View is never suppose to directly interact with
    //the Model, hence, it should not access the Model API's properties and methods
    private val _repository: CounterRepository = CounterRepository() //Create the CounterRepository API object
    private val _count = mutableStateOf(_repository.getCounter().count);

    //this public variable ensures that our private property is not exposed
    //to outside, only its value is
    val count : MutableState<Int> = _count

    fun increment()
    {
        _repository.incrementCounter();
        _count.value = _repository.getCounter().count;
    }
    fun decrement()
    {
        _repository.decrementCounter();
        _count.value = _repository.getCounter().count;
    }
}

