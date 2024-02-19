package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaFuncionarios() {
    println("Bem vindo ao Bytebank")

    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome ${alex.nome}")
    println("CPF ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran: Gerente = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome ${fran.nome}")
    println("CPF ${fran.cpf}")
    println("Salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")
    if (fran.autentica(1234)) {
        println("autenticou com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    val gui: Diretor = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome ${gui.nome}")
    println("CPF ${gui.cpf}")
    println("Salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")
    if (gui.autentica(4000)) {
        println("autenticou com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    val maria: Analista = Analista(nome = "Maria", cpf = "444.444.444-44", salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")
}