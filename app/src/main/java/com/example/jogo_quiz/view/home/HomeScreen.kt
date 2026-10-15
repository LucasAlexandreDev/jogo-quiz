package com.example.jogo_quiz.view.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogo_quiz.R

@Composable
fun HomeScreen(modifier: Modifier){

    // Coluna Geral dos elementos
    Column(
        modifier
            .fillMaxSize()
            .background(colorResource(R.color.azulApp)),

        verticalArrangement = Arrangement.spacedBy(60.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "logo Quiz",

            modifier = Modifier
                .size(200.dp)
                .padding(vertical = 16.dp)
        )

        Text(
            text = "QUIZATRON 3000",
            color = Color.Black,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Button(
            onClick = {},

            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.amareloApp)
            ),

            modifier = Modifier.width(300.dp)

        ) {

            Text(
                text = "COMEÇAR!",
                color = Color.Black,
                fontSize = 25.sp
            )
        }


    }
}