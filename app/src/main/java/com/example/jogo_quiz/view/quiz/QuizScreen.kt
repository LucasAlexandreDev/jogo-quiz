package com.example.jogo_quiz.view.quiz

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.jogo_quiz.componentes.CardQuiz
import com.example.jogo_quiz.componentes.alternativas

@Composable
fun QuizScreen(modifier: Modifier, navController: NavController){

    val questao1 = CardQuiz(
        numeroAtual  = 1,
        numeroMaximo = 3,
        pergunta     = "Qual é a capital da Franca",
        alternativas = listOf("Londres", "Berlim", "Paris", "Madri")
    )

    val questao2 = CardQuiz(
        numeroAtual  = 2,
        numeroMaximo = 3,
        pergunta     = "Onde fica o SENAI Jandira",
        alternativas = listOf("Carapicuíba", "Itapevi", "Barueri", "Osasco")
    )

    val questao3 = CardQuiz(
        numeroAtual  = 3,
        numeroMaximo = 3,
        pergunta     = "",
        alternativas = listOf("", "", "", "")
    )
}