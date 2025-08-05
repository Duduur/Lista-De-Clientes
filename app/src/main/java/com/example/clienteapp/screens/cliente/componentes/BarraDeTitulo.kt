package com.example.clienteapp.screens.cliente.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clienteapp.R
import com.example.clienteapp.ui.theme.ClienteAppTheme
import com.example.clienteapp.ui.theme.mozillaFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraDeTitulo(){
    TopAppBar(
        title = {
            Row (
                modifier = Modifier .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Text(
                        text = "Alanzoka",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        text = "tijolinho@twitchtv.com",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                Card (
                    modifier = Modifier
                        .size(60.dp)
                        .padding(4.dp),
                    shape = CircleShape
                ){
                   Image(
                       painter = painterResource(R.drawable.alanzoka),
                       contentDescription = "Foto de perfil",
                       contentScale = ContentScale.Crop
                   )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
    )
}


@Preview
@Composable
private fun BarraDeTituloPreview(){
    ClienteAppTheme {
        BarraDeTitulo()
    }
}