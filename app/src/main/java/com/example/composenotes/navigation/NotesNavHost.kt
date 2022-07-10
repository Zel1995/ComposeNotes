package com.example.composenotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenotes.screens.Add
import com.example.composenotes.screens.Main
import com.example.composenotes.screens.Note
import com.example.composenotes.screens.Start

sealed class NavRoute(val route: String) {
    object Start : NavRoute("start_screen")
    object Main : NavRoute("main_creen")
    object Add : NavRoute("add_creen")
    object Note : NavRoute("note_creen")
}

@Composable
fun NotesNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Start.route) {
        composable(NavRoute.Start.route) { Start(navController = navController) }
        composable(NavRoute.Main.route) { Main(navController = navController) }
        composable(NavRoute.Add.route) { Add(navController = navController) }
        composable(NavRoute.Note.route) { Note(navController = navController) }

    }
}
