package com.example.composenotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenotes.MainViewModel
import com.example.composenotes.screens.AddScreen
import com.example.composenotes.screens.MainScreen
import com.example.composenotes.screens.NoteScreen
import com.example.composenotes.screens.StartScreen

sealed class NavRoute(val route: String) {
    object Start : NavRoute("start_screen")
    object Main : NavRoute("main_creen")
    object Add : NavRoute("add_creen")
    object Note : NavRoute("note_creen")
}

@Composable
fun NotesNavHost(mViewModel: MainViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Start.route) {
        composable(NavRoute.Start.route) {
            StartScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Main.route) {
            MainScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Add.route) {
            AddScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
        composable(NavRoute.Note.route) {
            NoteScreen(
                navController = navController,
                viewModel = mViewModel
            )
        }
    }
}
