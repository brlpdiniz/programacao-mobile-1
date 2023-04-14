/*
Escreva uma classe que modela uma conta bancária:
Atributos: cliente, saldo, número, agência
Métodos: depositar, retirar, transferir, imprimirExtrato
*/

fun main(){

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