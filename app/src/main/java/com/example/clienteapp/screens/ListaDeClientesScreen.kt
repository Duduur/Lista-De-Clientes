package com.example.clienteapp.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.clienteapp.screens.cliente.componentes.BarraDeTitulo
import com.example.clienteapp.screens.cliente.componentes.BarraInferior
import com.example.clienteapp.screens.cliente.componentes.BotaoFlutuante
import com.example.clienteapp.screens.cliente.componentes.Conteudo
import com.example.clienteapp.ui.theme.ClienteAppTheme

@Composable
fun ListaDeClientes(modifier: Modifier = Modifier){
    Column {

        var controlerNavegacao = rememberNavController()

        Scaffold (
            topBar = {
               BarraDeTitulo()
            },
            bottomBar = {
                BarraInferior(controlerNavegacao)
            },
            floatingActionButton = {
                BotaoFlutuante(controlerNavegacao)
            },
            content = {padding ->
                NavHost(
                    navController = controlerNavegacao,
                    startDestination = "conteudo"
                ){
                    composable(route = "conteudo") { Conteudo((padding)) }
                    composable(route = "cadastro") { ClienteForm(padding,controlerNavegacao) }
                }
            }
        )


    }
}



@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun ListaDeClientesPreview(){
    ClienteAppTheme {
        ListaDeClientes()
    }
}
