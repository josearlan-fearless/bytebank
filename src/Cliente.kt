class Cliente(
    val nome: String,
    val cpf: String,
    var senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha)
            return true
        return false
    }
}