package me.andrescala.statecompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun Dado() {
    var num by remember {
        mutableIntStateOf(1)
    }

    val imagenRes = when (num) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column {
        Image(
            painter = painterResource(id = imagenRes),
            contentDescription = "Cara del dado $num"
        )
        Text(text = "$num")
        Button(onClick = {
            num = Random.nextInt(1, 7)
        }) {
            Text(text = "Dado")
        }
    }
}