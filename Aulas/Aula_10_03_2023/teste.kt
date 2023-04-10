fun main(){

    print("Digite o primeiro numero: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo numero: ")
    val num2 = readLine()!!.toInt()

    if (num1 > num2){
        println("O maior numero eh: ${num1}")
    } else {
        println("O maior numero eh: ${num2}")
    }
}