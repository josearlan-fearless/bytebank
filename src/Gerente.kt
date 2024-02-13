class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
) {

    //Agora fazendo a chamado da property da classe mãe com o super
    override val bonificacao: Double get() {
        return super.bonificacao + salario
    }


    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}