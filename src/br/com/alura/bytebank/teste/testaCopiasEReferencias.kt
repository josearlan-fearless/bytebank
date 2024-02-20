package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("João", "333.333.333-33", 5678)
    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
//    var contaMaria = contaJoao //Aqui tem atribuição por referência
    var contaMaria = ContaPoupanca(Cliente(
        "Maria",
        "444.444.444-44",
        9876
    ), 1003)  //Aqui é criada uma nova instância de objeto
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}