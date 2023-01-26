package com.example.leflambequizagusba.ui.views.home

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leflambequizagusba.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hello World!"
    }
    val text: LiveData<String> = _text
}