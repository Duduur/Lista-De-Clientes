package com.example.clienteapp.screens.cliente.componentes

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clienteapp.ui.theme.ClienteAppTheme

@Composable
fun ListaDeClientes(modifier: Modifier = Modifier){
    Column {
        Scaffold (
            topBar = {
               BarraDeTitulo()
            },
            bottomBar = {
                BarraInferior()
            },
            floatingActionButton = {
                BotaoFlutuante()
            },
            content = {padding ->
                Conteudo( padding)
            }
        )


    }
}



@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ListaDeClientesPreview(){
    ClienteAppTheme {
        ListaDeClientes()
    }
}
