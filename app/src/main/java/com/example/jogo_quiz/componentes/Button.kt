package com.example.jogo_quiz.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

val alternativas = listOf<String>("Londres", "teste", "teste", "teste")

// Alternativas
@Composable
fun ButtonAlternativa(modifier: Modifier){

    OutlinedButton(
        onClick = {},

        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp),

        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, Color.Black),

        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Black
        ),

        ){

        Text(
            text      = alternativas[0],
            modifier  = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start,
        )
    }
}
