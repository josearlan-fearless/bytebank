package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "222.222.222-22"
        var senha: Int = 4321

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("nome do cliente ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 4321)


    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234)
    val contaPoupanca = ContaPoupanca(titular = alex, 1001)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1002)

    println("Total de contas: ${Conta.total}")
}