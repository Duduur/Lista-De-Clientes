package com.example.clienteapp.service

import com.example.clienteapp.model.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


// retroft tem que criar uma requisiacao http no metodo post
interface ClienteService {

    @POST("clientes")
    //Quando o cliente for passado ele tem que ser adicionado no body, transformando esse objeto em um objeto JSON
    fun cadastrarCliente(@Body cliente: Cliente):Call<Cliente>

    @GET("clientes")
    fun listarTodos(): Call<List<Cliente>>

    @GET("clientes/{id}")
    fun buscarPorID(@Path("id")id : Long): Call<Cliente>

    @PUT("clientes")
    fun atualizar(@Body cliente: Cliente): Call<Cliente>

    @HTTP(method = "DELETE", path ="clientes", hasBody = true)
    fun excluir(@Body cliente: Cliente): Unit
}