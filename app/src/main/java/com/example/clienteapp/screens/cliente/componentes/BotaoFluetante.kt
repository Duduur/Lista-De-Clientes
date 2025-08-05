package com.example.clienteapp.screens.cliente.componentes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.clienteapp.ui.theme.ClienteAppTheme

@Composable
fun BotaoFlutuante(){
    FloatingActionButton(
        onClick = {},

    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Adicionar"
        )
    }
}

@Preview
@Composable
private fun BotaoFlutuantePreview(){
    ClienteAppTheme {
        BotaoFlutuante()
    }
}