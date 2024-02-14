 abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    //Utilizando agora o super, tirei o get() para ficar um código mais limpo
    abstract val bonificacao: Double
}