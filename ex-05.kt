fun main(){
    println("Digite o valor monetário: ")
    
    // val valorInicial = readLine()!!.toFloat
    var valorInicial = readLine()!!.toDouble

    var quantMoeda100 = 0
    var quantMoeda50 = 0
    var quantMoeda25 = 0
    var quantMoeda10 = 0
    var quantMoeda5 = 0
    var quantMoeda1 = 0

    while (valorInicial >= 1){
        valorInicial = valorInicial - 1         // valorInicial -= 1
        quantMoeda100 = quantMoeda100 + 1       // quantMoeda100++
    }
    while (valorInicial >= 0.5){
        valorInicial -= 0.5
        quantMoeda50++
    }
    while (valorInicial >= 0.25){
        valorInicial -= 0.25
        quantMoeda25++
    }
    while (valorInicial >= 0.10){
        valorInicial -= 0.10
        quantMoeda10++
    }
    while (valorInicial >= 0.05){
        valorInicial -= 0.05
        quantMoeda5++
    }
    while (valorInicial >= 0.01){
        valorInicial -= 0.01
        quantMoeda1++
    }

    println("1.00 * $quantMoeda100")
    println("0.50 * $quantMoeda50")
    println("0.25 * $quantMoeda25")
    println("0.10 * $quantMoeda10")
    println("0.05 * $quantMoeda5")
    println("0.01 * $quantMoeda1")
}