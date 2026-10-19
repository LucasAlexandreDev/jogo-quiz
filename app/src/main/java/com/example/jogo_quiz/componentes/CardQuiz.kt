package com.example.jogo_quiz.componentes

import android.R.attr.onClick
import android.R.attr.text
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextFieldDefaults.contentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogo_quiz.R


@Composable
fun CardQuiz(
    numeroAtual     : Int,
    numeroMaximo    : Int,
    pergunta        : String,
    alternativas    : List<String>

){

    Card(modifier = Modifier

        .size(300.dp, 150.dp),

        border = BorderStroke(2.dp, Color.Black),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.verdeApp)
        ),

        elevation = CardDefaults.cardElevation(4.dp)


    ) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Pergunta $numeroAtual de $numeroMaximo",
                color = Color.Black,
                fontSize = 25.sp
            )
        }
    }

    Card(modifier = Modifier
        .padding(20.dp)
        .fillMaxWidth()
        .height(300.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(4.dp)

    ){

        Column(
            modifier = Modifier,

            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {

            // Enunciado da pergunta
            Text(
                text       = pergunta,
                color      = Color.Black,
                fontSize   = 25.sp
            )
        }

    }

}

