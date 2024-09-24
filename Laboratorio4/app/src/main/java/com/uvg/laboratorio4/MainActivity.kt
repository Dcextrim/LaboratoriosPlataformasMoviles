package com.uvg.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "profile") {
                    composable("profile") {
                        MyProfileScreen2(navController = navController) // Vista2
                    }
                    composable("settings") {
                        Ajustescreen(navController = navController) // Vista3
                    }
                }
            }
        }
    }
}
