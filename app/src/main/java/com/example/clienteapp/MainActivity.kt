package com.example.clienteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clienteapp.model.Cliente
import com.example.clienteapp.screens.cliente.componentes.ListaDeClientes
import com.example.clienteapp.service.Conexao
import com.example.clienteapp.ui.theme.ClienteAppTheme
import kotlinx.coroutines.Dispatchers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClienteAppTheme {

                ListaDeClientes()

//                val cliente = Cliente(
//                    id = null,
//                    nome = "Cadastro do dudu",
//                    email = "tchetche@gmail.com"
//                )
//
//                val enviar = Conexao().getClienteService()
//
//               LaunchedEffect(Dispatchers.IO) {
//                   enviar.cadastrarCliente(cliente).await()
//               }


            }
        }
    }
}

