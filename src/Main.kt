fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.deposita(200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.titular)
    println(contaFran.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando da conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando da conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaAlex.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")
    if (contaFran.trasnfere(300.0, contaAlex)) {
        println("tranferência sucedida")
    } else {
        println("falha na tranferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set(value) {
                field = value
        }

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

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
//    var contaMaria = contaJoao //Aqui tem atribuição por referência
    var contaMaria = Conta()  //Aqui é criada uma nova instância de objeto
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }

    // Esse range do for é inclusivo, ou seja, o primeiro
    // e o último número do intervalo é utilizado.
//    for (i in 1..5)
//    for (i in 1..5 step 2)
//    for (i in 5 downTo 1) {
//        if (i == 4) {
//            break
//            continue
//        }
//        val titular = "Alex $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular $titular")
//        println("Número da conta $numeroConta")
//        println("Saldo da conta $saldo")
//        println()
//    }
//    testaCondicoes(saldo)
}

private fun testaCondicoes(saldo: Double) {
    //O kotlin pede o tipo explícito de variáveis em parametros
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
    //Outro exemplo só que usando o when, mesmo resultado!
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}
