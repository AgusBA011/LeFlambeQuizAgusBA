package com.example.leflambequizagusba.ui.views.progressbar

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leflambequizagusba.R

class ProgressBarViewModel : ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>().apply {
        value = true
    }

    private val _text = MutableLiveData<String>().apply {
        value = "The data has loaded. Tap to load again."
    }
    val text: LiveData<String> = _text

    val isLoading: LiveData<Boolean> = _isLoading

    fun toggleProgressBarState() {
        _isLoading.postValue(isLoading.value?.not() ?: true)
    }
}