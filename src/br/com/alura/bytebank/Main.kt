package br.com.alura.bytebank
import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaFuncionarios
import br.com.alura.bytebank.teste.testaObjects
import java.util.Objects


fun main() {
    val endereco = Endereco()

    val objeto : Any = Any()
    imprime(objeto)

    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste )
    testaFuncionarios()
}

fun imprime(valor : Any) : Any {
    println(valor)
    return valor
}
