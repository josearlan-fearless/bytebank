package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val alex = Cliente("Alex", "111.111.111-11", 1234)

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val fran = Cliente("Fran", "222.222.222-22", 4321)

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.trasnfere(100.0, contaPoupanca)

    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupanca após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.trasnfere(200.0, contaCorrente)

    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}