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
import com.example.nbscollege.navigation.routes.Routes
import com.example.nbscollege.screens.main.AboutScreen
import com.example.nbscollege.screens.main.Contact
import com.example.nbscollege.screens.main.HomeScreen
import com.example.nbscollege.screens.main.Statement
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
                composable(route = MainRoute.Statement.name) {
                    Statement(navController)
                }
                composable(route = MainRoute.Contact.name) {
                    Contact(navController)
                }
                navigation(
                    startDestination = ProgramsRoute.ProgramListScreen.name,
                    route = Routes.PROGRAMS.name
                ) {
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
