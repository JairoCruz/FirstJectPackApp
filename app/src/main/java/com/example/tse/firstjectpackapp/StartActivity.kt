package com.example.tse.firstjectpackapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.tse.firstjectpackapp.ui.start.StartFragment

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

//        TODO 8: Agregar y Configurar un toolbar personalizado
        // Configurar toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

//        TODO 9: Defino una variable host del tipo NavHostFragment, recuperandolo de mi fragmento definido en mi actividad main
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return

//        TODO 10: Luego creo una variable navController y le asigno la misma propiead del objeto host
        val navController = host.navController

//        TODO 11: Luego le paso el navController a una funcion para habilitar la navegacion hacia arriba
        setupActionBar(navController)
    }

//    TODO 13: Junto con la funcion setupActionBar permite el funcionamiento de la navegacion hacia arriba
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(null, Navigation.findNavController(this, R.id.my_nav_host_fragment))
    }

//    TODO 12: Esta funcion hace que se muestre un elemento de navegacion hacia arriba cuando navego de fragmento en fragmento
    private fun setupActionBar(navController: NavController) {
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

}
