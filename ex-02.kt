fun main(){

    val min = 1
    val max = 10
    var fatorial: Int = 1
    
    for (i in min..max){        // 1 2 3 4 5 6 7 8 9 10
        fatorial *= i
        println ("O fatorial de $i é: $fatorial")
    }
    println ("O fatorial de 0 é: 1")
}