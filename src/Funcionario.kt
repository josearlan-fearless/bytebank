class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double,
    val tipo: Int  // 0 funcionario, 1 Gerente,  2 Diretor
) {

    fun bonificacao(): Double {
        when (tipo) {
            0 -> {
                return salario * 0.1
            }
            1 -> {
                return salario * 0.2
            }
            else -> {
                return salario * 0.3
            }
        }
    }
}