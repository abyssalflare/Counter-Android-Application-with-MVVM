package com.example.countermvvm


data class CounterModel(var count: Int)//The "Model", just a data class in this case, but in reality,
                                        //could be like a database online or local databases

//API - a bridge between different programs, in this case. it is the bridge
//between the data wherever it comes from, and the ViewModel. Basically,
//this api takes the data and formats it in such a way that we can present
//to the ViewModel to present it to the View. It is responsible for managing
//the data to present to the ViewModel. Kinda like how a waiter takes your words,
//convert them to jargon that the kitchen understands and can use to prepare your
//order, this api takes the data from the model and formats it in a way for the
//ViewModel to understand and use to present to the View
class CounterRepository
{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter()
    {
        _counter.count++
    }

    fun decrementCounter()
    {
        _counter.count--
    }
}
