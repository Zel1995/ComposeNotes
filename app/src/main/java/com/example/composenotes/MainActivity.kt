package com.example.composenotes

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composenotes.navigation.NotesNavHost
import com.example.composenotes.ui.theme.ComposeNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNotesTheme {
                val context = LocalContext.current
                val mViewModel: MainViewModel =
                    viewModel(
                        factory =
                        MainViewModelFactory(context.applicationContext as Application)
                    )

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Notes app")
                            },
                            backgroundColor = Color.Blue,
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    },
                    content = {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colors.background
                        ) {
                            NotesNavHost(mViewModel)
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeNotesTheme {
        val context = LocalContext.current
        val mViewModel: MainViewModel =
            viewModel(
                factory =
                MainViewModelFactory(context.applicationContext as Application)
            )
        Greeting("Android")
    }
}
