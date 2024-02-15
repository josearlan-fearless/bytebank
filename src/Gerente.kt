class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }

    override val bonificacao: Double get() {
        return salario
    }
}