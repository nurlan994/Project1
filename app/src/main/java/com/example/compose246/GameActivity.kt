package com.example.compose246

import android.inputmethodservice.Keyboard
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent
import kotlin.random.Random

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        questionGenerator(1)
    }
}

// List: parent
// mutableList: Child
fun questionGenerator(n: Int): List<Question> {
    val questions = mutableListOf<Question>()
    val random = Random
    repeat(n) {
        val a = random.nextInt(0, 100)
        val b = random.nextInt(0, 100)
        //+ - * /
        val opp = (1 .. 4).random()
        val (text, correctAns) = when(opp) {
            1 -> {"$a + $b = ?" to a + b}
            2 -> {"$a - $b = ?" to a - b}
            3 -> {"$a * $b = ?" to a * b}
            else -> {
                val t = a * b
                "$t / $b = ?" to a
            }
        }
        questions.add(Question(text, correctAns, listOf()))
        Log.d("qalay", "t: $text, $correctAns")
        }

    return questions
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Game() {
    var i = 1
    Box(modifier = Modifier.fillMaxSize().statusBarsPadding().background(color = Color.Blue)) {
        Column(modifier = Modifier.fillMaxSize()) {
            LinearProgressIndicator(modifier = Modifier.fillMaxWidth().height(54.dp).padding(16.dp).clip(RoundedCornerShape(8.dp)), color = Color.White, trackColor = Color.White.copy(0.5f))
            Text(modifier = Modifier.fillMaxWidth(), text = "Question $i from 10", fontSize = 12.sp, color = Color.White)
            Text(modifier = Modifier.fillMaxWidth(), text = "3 * 2 = ?", color = Color.White)
        }
    }
}