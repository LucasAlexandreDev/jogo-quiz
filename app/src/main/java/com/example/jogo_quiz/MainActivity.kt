package com.example.jogo_quiz

import android.R.attr.name
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jogo_quiz.ui.theme.JogoquizTheme
import com.example.jogo_quiz.view.home.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JogoquizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
