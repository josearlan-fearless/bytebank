package br.com.alura.bytebank
import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaFuncionarios
import br.com.alura.bytebank.teste.testaObjects
import java.util.Objects


fun main() {
    val endereco = Endereco(logradouro = "Rua vergueiro", complemento = "alura")
    val enderecoNovo = Endereco(bairro = "Vila Mariana", numero = 1000)
    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${java.lang.Integer.toHexString(endereco.hashCode())}")

}

fun imprime(valor : Any) : Any {
    println(valor)
    return valor
}
