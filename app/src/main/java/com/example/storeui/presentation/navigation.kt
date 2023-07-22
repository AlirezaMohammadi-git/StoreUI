package com.example.storeui.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.storeui.MainScreen
import com.example.storeui.presentation.splashScreen.SplashScreen


@Composable
fun Navigation() {

    val navHostController = rememberNavController()
    NavHost(navHostController, "splashScreen") {
        composable("splashScreen"){
            SplashScreen(navHostController)
        }
        composable("mainScreen"){
            MainScreen("SplashScreenTest")
        }
    }

}

