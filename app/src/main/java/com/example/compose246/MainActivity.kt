package com.example.compose246

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose246.ui.theme.Compose246Theme
import org.intellij.lang.annotations.JdkConstants
import kotlin.io.path.fileVisitor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Composable
fun Table() {
    val colors = listOf(Color.Blue, Color.Red, Color.Green)
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            repeat(3) { colID ->
            Row(modifier = Modifier.fillMaxSize().weight(1f)) {
                repeat(3) {rowID ->
                    var color = colors.random()
                    Box(modifier = Modifier.fillMaxSize().weight(1f).background(color).border(1.dp, Color.Black))
                }
            }
            }
        }
    }
}

@Composable
fun RowExample() {
    val colors = listOf(Color.Green, Color.Yellow, Color.Blue, Color.Red, Color.Black, Color.White)
    Box(modifier = Modifier.fillMaxSize()) {
    Column(modifier = Modifier.fillMaxSize()) {
        repeat(3) { colid ->
    Row(modifier = Modifier.fillMaxWidth(). weight(1f)) {
        repeat(3) { rowid ->
            var color = colors.random()
        Box(modifier = Modifier.fillMaxHeight().weight(1f).background(color).border(1.dp, Color.Black)) {
            Text("$colid $rowid")
        }
        }
    }
        }
    }
    }
}

@Composable
fun Belgium() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Black)) {}
        Box(modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Yellow)) {}
        Box(modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Red)) {}}
}

@Composable
fun Germany() {
    Row(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Yellow)) {}
        Box(modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Red)) {}
        Box(modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Black)) {}}
}

@Composable
fun Sweden() {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.Blue)) {
            Box(modifier = Modifier.fillMaxWidth()) {
                    Box(modifier = Modifier.padding(top = 200.dp).fillMaxWidth().background(color = Color.Yellow).height(70.dp))
            }
            Box(modifier = Modifier.fillMaxHeight()) {
                Box(modifier = Modifier.padding(start = 150.dp).fillMaxHeight().background(color = Color.Yellow).width(70.dp))
            }
        }
}

@Composable
fun Norway() {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.Red)) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.padding(top = 200.dp).fillMaxWidth().background(color = Color.White).height(70.dp)) {
            Box(modifier = Modifier.padding(top = 15.dp).fillMaxWidth().background(color = Color.Blue).height(40.dp))
            }
        }
        Box(modifier = Modifier.fillMaxHeight()) {
            Box(modifier = Modifier.padding(start = 150.dp).fillMaxHeight().background(color = Color.White).width(70.dp)) {
            Box(modifier = Modifier.padding(start = 15.dp).fillMaxHeight().background(color = Color.Blue).width(40.dp))
            }
        }
    }
}

@Composable
fun Norwayeasy() {
    Box(modifier = Modifier.fillMaxSize().background(color = Color.Red)) {
            Box(modifier = Modifier.padding(top = 200.dp).fillMaxWidth().background(color = Color.White).height(70.dp))
            Box(modifier = Modifier.padding(top = 215.dp).fillMaxWidth().background(color = Color.Blue).height(40.dp))
            Box(modifier = Modifier.padding(start = 150.dp).fillMaxHeight().background(color = Color.White).width(70.dp))
            Box(modifier = Modifier.padding(start = 165.dp).fillMaxHeight().background(color = Color.Blue).width(40.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Math() {}