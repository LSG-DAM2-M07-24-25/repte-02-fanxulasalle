package com.fanxu.repte02

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color


@Composable
fun SeleccionScreen(navController: NavController) {
    val images = listOf(
        R.drawable.goku,
        R.drawable.gomah,
        R.drawable.vegeta,
        R.drawable.piccolo,
        R.drawable.supreme,
        R.drawable.masked_majin,
    )
    var seleccionado by remember { mutableStateOf<Int?>(null) }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "Header",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 16.dp)
            )
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 100.dp),
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(images.size) { index ->
                    OutlinedButton(
                        onClick = { seleccionado = index },
                        border = BorderStroke(
                            2.dp,
                            Color.Black.copy(alpha = if (seleccionado == index) 1f else 0.5f)
                        ),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.size(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = images[index]),
                            contentDescription = "Character Image",
                            modifier = Modifier.size(64.dp)
                        )
                    }
                }
            }

            OutlinedButton(
                onClick = {
                        navController.navigate("NombreScreen/$seleccionado")
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 16.dp),
                enabled = seleccionado != null,
                shape = RoundedCornerShape(4.dp)
            ) {
                Text("Continuar")
            }
        }
    }
}


