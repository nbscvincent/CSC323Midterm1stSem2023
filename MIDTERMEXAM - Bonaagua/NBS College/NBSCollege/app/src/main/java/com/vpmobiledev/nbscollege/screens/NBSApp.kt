import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.vpmobiledev.nbscollege.navigation.data.routes.AuthRoute
import com.vpmobiledev.nbscollege.navigation.data.routes.MainRoute
import com.vpmobiledev.nbscollege.navigation.data.routes.Routes
import com.vpmobiledev.nbscollege.screens.auth.LoginScreen
import com.vpmobiledev.nbscollege.screens.auth.RegistrationScreen
import com.vpmobiledev.nbscollege.screens.SplashScreen
import com.vpmobiledev.nbscollege.screens.main.AboutScreen
import com.vpmobiledev.nbscollege.screens.main.HomeScreen
import com.vpmobiledev.nbscollege.viewmodel.ScreenViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NBSApp(
    screenViewModel: ScreenViewModel,
) {
    val navController: NavHostController = rememberNavController()

    Scaffold {
        NavHost(navController = navController, startDestination =  Routes.SPLASH.name) {
            composable(route = Routes.SPLASH.name) {
                SplashScreen(navController, screenViewModel)
            }
            navigation(startDestination = AuthRoute.LoginScreen.name, route = Routes.AUTH.name) {
                composable(route = AuthRoute.LoginScreen.name) {
                    LoginScreen(navController)
                }
                composable(route = AuthRoute.RegistrationScreen.name) {
                    RegistrationScreen(navController)
                }
            }
            composable(route = Routes.MAIN.name) {
                MainScreen()
            }

            composable(route = MainRoute.HomeScreen.name) {
                HomeScreen(navController)
            }
        }
    }
}
