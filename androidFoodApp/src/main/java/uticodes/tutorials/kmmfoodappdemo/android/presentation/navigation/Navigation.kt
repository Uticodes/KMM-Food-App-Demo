package uticodes.tutorials.kmmfoodappdemo.android.presentation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route) {
        composable(route = Screen.RecipeList.route) { navBackStackEntry ->
            Column {
                Text("RecipeListScreen", color = Color.White)
                Divider()
                Button(onClick = { navController.navigate(Screen.RecipeDetail.route)}) {
                    Text("Go RecipeDetail", color = Color.White)
                }
            }
        }
        composable(
            route = Screen.RecipeDetail.route,
        ) { navBackStackEntry ->
            Text("RecipeDetailScreen", color = Color.White)
        }
    }
}