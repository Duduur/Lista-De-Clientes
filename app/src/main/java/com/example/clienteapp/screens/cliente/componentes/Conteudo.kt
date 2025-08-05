package com.example.clienteapp.screens.cliente.componentes

import android.content.ClipData.Item
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clienteapp.ui.theme.ClienteAppTheme

@Composable
fun Conteudo(paddingValues: PaddingValues){

    Column (
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(10.dp)
        ){
           Icon(
               imageVector = Icons.Default.Person,
               contentDescription = "person"
           )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Lista de Clientes"
            )
        }
        LazyColumn {
            items(count = 10){
                Card (
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            end = 8.dp,
                            bottom = 8.dp
                        )
                        .fillMaxSize()
                        .height(80.dp)

                ){
                    Row (
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Column {
                            Text(text = "Nome da Pessoa")
                            Text(text = "email@dapessoa")
                        }
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Deletar"
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
private fun ConteuudoPreview(){
    ClienteAppTheme {
        Conteudo(PaddingValues(16.dp))
    }
}