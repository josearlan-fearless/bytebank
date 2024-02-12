fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome ${alex.nome}")
    println("CPF ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome ${fran.nome}")
    println("CPF ${fran.cpf}")
    println("Salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")
    if (fran.autentica(1234)) {
        println("autenticou com sucesso!")
    } else {
        println("Falha na autenticação!")
    }
}