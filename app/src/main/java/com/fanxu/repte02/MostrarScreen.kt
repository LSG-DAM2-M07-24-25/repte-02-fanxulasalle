package com.fanxu.repte02

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MostrarScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            modifier = Modifier.align(Alignment.Center)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.personaje),
                contentDescription = "Header",
                modifier = Modifier.align(Alignment.CenterHorizontally).size(400.dp).padding(bottom = 10.dp)
            )
            Text(text = nombre)
            OutlinedButton(
                onClick = { navController.navigate(Routes.InicioScreen)},
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text("Tornar")
            }
        }
    }
}