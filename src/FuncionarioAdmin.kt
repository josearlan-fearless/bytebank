abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    var salario: Double,
    val senha: Int
) {
    abstract val bonificacao: Double

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}