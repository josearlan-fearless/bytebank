interface Autenticavel {
    //Informação senssível, portanto não é aconselhável fazer na interface.
    //O ideal é que cada classe implemente esse tipo de informação.

    val senha: Int

    fun autentica(senha: Int) : Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}