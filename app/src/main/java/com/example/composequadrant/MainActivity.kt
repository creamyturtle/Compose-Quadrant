package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrants()
                }
            }
        }
    }
}

@Composable
fun Quadrants() {

    Column(modifier = Modifier.fillMaxSize()) {

        Row(modifier = Modifier.weight(0.5F)) {


            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .fillMaxHeight()
            ) {

                Text(
                    text = stringResource(R.string.text_composable),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = stringResource(R.string.text_composable_long),
                    textAlign = TextAlign.Justify

                )

            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .fillMaxHeight()
            ) {

                Text(
                    text = stringResource(R.string.image_composable),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = stringResource(R.string.image_composable_long),
                    textAlign = TextAlign.Justify

                )

            }



        }

        Row(modifier = Modifier.weight(0.5F)) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .fillMaxHeight()
            ) {

                Text(
                    text = stringResource(R.string.row_composable),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = stringResource(R.string.row_composable_long),
                    textAlign = TextAlign.Justify

                )

            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .fillMaxHeight()
            ) {

                Text(
                    text = stringResource(R.string.column_composable),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = stringResource(R.string.column_composable_long),
                    textAlign = TextAlign.Justify

                )

            }

        }


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrants()
    }
}