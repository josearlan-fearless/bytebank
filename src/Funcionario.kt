open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    //Conversão de função para property, porém não temos mais o backing field
    //Aqui também foi adicionada logo como uma expressão,
    // podendendo até mesmo eliminar o get()e i tipo
    open val bonificacao: Double get() = salario * 0.1
}