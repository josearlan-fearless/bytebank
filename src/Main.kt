fun main() {
    println("Hello World!")
    var i = 0
    while (i < 5){
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
