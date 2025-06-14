package com.example.jetjokes

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JokeViewModel @Inject constructor(
    val api: JokeApi
): ViewModel() {

    private val _state = MutableStateFlow(value = JokeState())
    val state = _state.asStateFlow()

    init {
        getNewJoke()
    }

    fun getNewJoke() {
        viewModelScope.launch {
            val newJoke = api.getNewJoke()
            if (newJoke.isSuccessful) {
                _state.value = _state.value.copy(
                    joke = newJoke.body()?.joke ?: "Joke Retrive Nahi Hua re",
                    author = "Animesh",
                    isClicked = false
                )
            }
        }
    }

    fun falseClickResponse() {
        _state.value = _state.value.copy(
            isClicked = false
        )
    }
    fun trueClickResponse() {
        _state.value = _state.value.copy(
            isClicked = true
        )
    }
}