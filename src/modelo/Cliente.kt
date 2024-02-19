package modelo

import modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    private var senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}