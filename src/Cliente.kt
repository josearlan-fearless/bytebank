class Cliente(
    val nome: String,
    val cpf: String,
    override var senha: Int
) : Autenticavel