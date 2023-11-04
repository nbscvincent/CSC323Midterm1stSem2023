import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.vpmobiledev.nbscollege.navigation.bottomNavBar.BottomNavBar
import com.vpmobiledev.nbscollege.navigation.data.routes.MainRoute
import com.vpmobiledev.nbscollege.navigation.data.routes.ProgramsRoute
import com.vpmobiledev.nbscollege.navigation.data.routes.Routes
import com.vpmobiledev.nbscollege.screens.main.AboutScreen
import com.vpmobiledev.nbscollege.screens.main.ContactScreen
import com.vpmobiledev.nbscollege.screens.main.HomeScreen
import com.vpmobiledev.nbscollege.screens.main.TestimonialsListScreen
import com.vpmobiledev.nbscollege.screens.programs.ProgramListScreen
import com.vpmobiledev.nbscollege.screens.programs.ProgramsDetailScreen

@Composable
fun MainScreen(
) {
    val navController: NavHostController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavBar(navController = navController)
    }) {
        Box(modifier = Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = MainRoute.HomeScreen.name) {
                composable(route = MainRoute.HomeScreen.name) {
                    HomeScreen(navController)
                }
                composable(route = MainRoute.AboutScreen.name) {
                    AboutScreen(navController)
                }
                composable(route = MainRoute.ContactScreen.name) {
                    ContactScreen(navController)
                }
                composable(route = MainRoute.ContactScreen.name) {
                    ContactScreen(navController)
                }

                navigation(startDestination = ProgramsRoute.ProgramListScreen.name,route = Routes.PROGRAMS.name) {
                    composable(route = ProgramsRoute.ProgramListScreen.name) {
                        ProgramListScreen(navController)
                    }
                    composable(route = ProgramsRoute.ProgramDetailScreen.name) {
                        ProgramsDetailScreen(navController)
                    }
                }
            }
        }
    }
}
