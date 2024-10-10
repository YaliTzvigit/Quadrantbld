package com.example.quadrantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrantapp.ui.theme.QUADRANTAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QUADRANTAppTheme {
                Quadrant()
            }
        }
    }
}

@Composable
fun Quadrant() {

    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier.weight(1f)
        ){
            QuadrantsItem(
                title = "Text Composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier
                    .weight(1f)


            )
            QuadrantsItem(
                title = "Image Composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }

        Row(
            modifier = Modifier.weight(1f)
        ){
            QuadrantsItem(
                title = "Row Composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
            QuadrantsItem(
                title = "Column Composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

// QuadrantsItem

@Composable
fun QuadrantsItem(title : String, description: String, backgroundColor: Color, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment  = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = description,
            fontSize = TextUnit.Unspecified, // Taille de texte non spécifiée..
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantPreview() {
    QUADRANTAppTheme {
        Quadrant()
    }
}