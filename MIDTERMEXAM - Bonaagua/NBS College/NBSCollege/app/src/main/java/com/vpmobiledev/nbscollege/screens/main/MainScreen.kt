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
import com.vpmobiledev.nbscollege.screens.main.ContactScreen
import com.vpmobiledev.nbscollege.screens.main.AboutScreen
import com.vpmobiledev.nbscollege.screens.main.HomeScreen
import com.vpmobiledev.nbscollege.screens.programs.ProgramListScreen
import com.vpmobiledev.nbscollege.screens.programs.ProgramsDetailScreen
import com.vpmobiledev.nbscollege.screens.programs.programScreens.BSAISScreen
import com.vpmobiledev.nbscollege.screens.programs.programScreens.BSAScreen
import com.vpmobiledev.nbscollege.screens.programs.programScreens.BSComSciScreen
import com.vpmobiledev.nbscollege.screens.programs.programScreens.BSEntrepScreen
import com.vpmobiledev.nbscollege.screens.programs.programScreens.BSTMScreen

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
                navigation(
                    startDestination = ProgramsRoute.ProgramListScreen.name,
                    route = Routes.PROGRAMS.name
                ) {
                    composable(route = ProgramsRoute.ProgramListScreen.name) {
                        ProgramListScreen(navController)
                    }
                    composable(route = ProgramsRoute.BSA.name) {
                        BSAScreen(navController)
                    }
                    composable(route = ProgramsRoute.BSAIS.name) {
                        BSAISScreen(navController)
                    }
                    composable(route = ProgramsRoute.BSEntrep.name) {
                        BSEntrepScreen(navController)
                    }
                    composable(route = ProgramsRoute.BSComSci.name) {
                        BSComSciScreen(navController)
                    }
                    composable(route = ProgramsRoute.BSTM.name) {
                        BSTMScreen(navController)
                    }
                }
            }
        }
    }
}
