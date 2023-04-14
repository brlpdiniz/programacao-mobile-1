fun main() {
    val contas = listOf(
        ContaBancaria("João Silva", 1000.0, 1234, "0001"),
        ContaBancaria("Maria Souza", 500.0, 5678, "0001"),
        ContaBancaria("Pedro Santos", 2000.0, 2468, "0002"),
        ContaBancaria("Ana Almeida", 1500.0, 1357, "0002"),
        ContaBancaria("Carlos Oliveira", 750.0, 7890, "0003")
    )

    println("Contas em ordem crescente do menor para o maior saldo:")
    contas.sortedBy { it.saldo }.forEach {
        it.imprimirExtrato()
        println()
    }

    println("Contas em ordem alfabética pelo nome do cliente:")
    contas.sortedBy { it.cliente }.forEach {
        it.imprimirExtrato()
        println()
    }
}

class ContaBancaria (val cliente: String, var saldo: Double = null, var numero: Int, val agencia: Int){
        
    fun depositar(operacao: Double){
        operacao = readLine()!!.toDouble()
        saldo += operacao
    }

    fun retirar(operacao: Double){
        operacao = readLine()!!.toDouble()
        if(saldo < operacao){
            println("Saldo insuficiente")
        } else{
            saldo -= operacao
        }
    }

    fun transferir(operacao: Double, numero.saldo: ContaBancaria){
        operacao = readLine()!!.toDouble()
        numero = readLine()!!.toInt()
        if (saldo < operacao){
            println("Saldo insuficiente")
        } else{
            saldo -= operacao
            numero.saldo += operacao
        }
    }

    fun imprimirExtrato(){
        println("Extrato:")
        println("Cliente: $cliente")
        println("Agência: $agencia")
        println("Número da conta: $numero")
        println("Saldo: R$$saldo")
    }
}