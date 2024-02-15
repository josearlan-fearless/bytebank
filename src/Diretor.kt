class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }

    override val bonificacao: Double get() {
        return salario + plr
    }
}