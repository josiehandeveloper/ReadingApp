package com.example.readingapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.readingapp.screens.ReaderSplashScreen
import com.example.readingapp.screens.home.Home
import com.example.readingapp.screens.login.ReaderLoginScreen
import com.example.readingapp.screens.search.SearchScreen
import com.example.readingapp.screens.stats.ReaderStatsScreen
import com.example.readingapp.screens.update.BookUpdateScreen

@ExperimentalComposeApi
@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination =  ReaderScreens.SplashScreen.name) {
        composable(ReaderScreens.SplashScreen.name){
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.ReaderHomeScreen.name){
            Home(navController = navController)
        }

        composable(ReaderScreens.SearchScreen.name){
            SearchScreen(navController = navController)
        }

        composable(ReaderScreens.UpdateScreen.name){
           BookUpdateScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderStatsScreen.name){
            ReaderStatsScreen(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name){
            ReaderLoginScreen(navController = navController)
        }

    }
}