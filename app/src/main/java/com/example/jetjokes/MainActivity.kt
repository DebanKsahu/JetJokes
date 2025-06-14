package com.example.jetjokes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.jetjokes.ui.theme.JetJokeUI
import com.example.jetjokes.ui.theme.JetJokesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: JokeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            val state by viewModel.state.collectAsState(initial = JokeState())
            JetJokesTheme {
                JetJokeUI(
                    state = state,
                    onClick1 = {viewModel.getNewJoke()},
                    onClick2 = {viewModel.falseClickResponse()},
                    onClick3 = {viewModel.trueClickResponse()}
                )
            }
        }
    }
}