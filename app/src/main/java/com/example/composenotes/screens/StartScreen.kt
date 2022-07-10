package com.example.composenotes.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composenotes.navigation.NavRoute
import com.example.composenotes.ui.theme.ComposeNotesTheme

@Composable
fun StartScreen(navController: NavHostController) {
    Scaffold(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "use?")
            Button(
                onClick = { navController.navigate(route = NavRoute.Main.route) },
                modifier = Modifier.width(200.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text(text = "room database")
            }
            Button(
                onClick = { navController.navigate(route = NavRoute.Main.route) },
                modifier = Modifier.width(200.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text(text = "firebase database")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevStartScreen() {
    ComposeNotesTheme {
        StartScreen(navController = rememberNavController())
    }
}
