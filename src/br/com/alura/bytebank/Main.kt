package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas
import br.com.alura.bytebank.teste.testaContasDiferentes


fun main() {
    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234)
    val contaPoupanca = ContaPoupanca(titular = alex, 1001)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1002)

    testaContasDiferentes()
    println("Total de contas: ${totalContas}")
}
