class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int, saldo: Double) : this(titular, numero){
//        this.saldo = saldo
//    }

    fun deposita(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun trasnfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}