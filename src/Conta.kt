abstract class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        protected set

//    constructor(titular: String, numero: Int, saldo: Double) : this(titular, numero){
//        this.saldo = saldo
//    } //construtor secundário, fazendo o overload de métodos, chamando o primário pelo this()

    fun deposita(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun trasnfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}