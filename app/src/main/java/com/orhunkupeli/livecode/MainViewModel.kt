package com.orhunkupeli.livecode

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.orhunkupeli.livecode.model.Person

class MainViewModel: ViewModel() {
    val people: MutableLiveData<List<Person>> = MutableLiveData()

    fun calculateAgeAverage(): Double? {
        return 0.0
    }
}