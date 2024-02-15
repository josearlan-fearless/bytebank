abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    //Como a classe também é abstrata e herda de outra abstrata,
    //nao precisa implementar a bonificação, ou então até poderia,
    //mas pra isso sobreescrevendo o método.

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}