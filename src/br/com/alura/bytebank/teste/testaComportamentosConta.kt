package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    println("Bem vindo ao Bytebank")
    val alex = Cliente("Alex", "111.111.111-11", senha = 1234)
    val contaAlex = ContaCorrente(numero = 1000, titular = alex)
    contaAlex.deposita(200.0)

    val fran = Cliente("Fran", "222.222.222-22", senha = 4321)
    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.titular)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando da conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando da conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaAlex.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")
    if (contaFran.trasnfere(destino = contaAlex, valor = 300.0)) {
        println("tranferência sucedida")
    } else {
        println("falha na tranferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}