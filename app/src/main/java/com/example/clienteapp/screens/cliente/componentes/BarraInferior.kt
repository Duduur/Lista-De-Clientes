package com.example.clienteapp.screens.cliente.componentes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.clienteapp.ui.theme.ClienteAppTheme

@Composable
fun BarraInferior(controlerNavegacao: NavHostController?) {
    NavigationBar (
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ){
        NavigationBarItem(
            onClick = {
                controlerNavegacao!!.navigate("conteudo")
            },
            selected = false,
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home"
                )
            },
            label = {
                Text(text = "Home")
            }
        )

        NavigationBarItem(
            onClick = {

            },
            selected = false,
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite"
                )
            },
            label = {
                Text(text = "Favorite")
            }
        )


        NavigationBarItem(
            onClick = {
                controlerNavegacao!!.navigate("cadastro")
            },
            selected = false,
            icon = {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "novo"
                )
            },
            label = {
                Text(text = "Novo Cliente")
            }
        )
    }
}


@Preview
@Composable
private fun BarrainferiorPreview(){
    ClienteAppTheme {
        BarraInferior(null)
    }
}