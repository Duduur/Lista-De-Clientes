package com.example.clienteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.clienteapp.screens.ListaDeClientes
import com.example.clienteapp.ui.theme.ClienteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClienteAppTheme {

                ListaDeClientes()

            }
        }
    }
}

