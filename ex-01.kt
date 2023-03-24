fun main(){

    println("Digite um número inteiro: ")
    var inteiro = readLine()!!.toInt()
    var fatorial: Int = 1

    if (inteiro == 0){
        println("O fatorial de 0 é 1")
    } else {
        for (i in 1..inteiro) {
            fatorial *= i
            // fatorial = fatorial * i
        }
        println("O fatorial de $inteiro é $fatorial")
    }
}