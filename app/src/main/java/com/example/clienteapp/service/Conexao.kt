package com.example.clienteapp.service

import com.example.clienteapp.model.Cliente
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Conexao {

    private val BASE_URL = "https://srv945707.hstgr.cloud/api/"

    //recebe a conexao com a URL
    private val conexao = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) // usa esse conversor
        .build()

    fun getClienteService(): ClienteService{
        return conexao.create(ClienteService::class.java)
    }
}