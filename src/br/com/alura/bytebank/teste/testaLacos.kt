package br.com.alura.bytebank.teste

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