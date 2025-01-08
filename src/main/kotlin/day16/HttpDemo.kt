package day16

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking
// Ktor 를 활용한 실제 통신
fun main():Unit = runBlocking {
    val httpClient = HttpClientFactory.creat()
    val response = httpClient.get("https://jsonplaceholder.typicode.com/posts/1")
    println(response.bodyAsBytes())
}

object HttpClientFactory {
    fun creat(): HttpClient = HttpClient(CIO)
}


