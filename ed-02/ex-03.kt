fun main(){

    println("Digite 3 número reais: ")  // 104,33   13,5   7
    val num1 = readLine()!!.toDouble()
    val num2 = readLine()!!.toDouble()
    val num3 = readLine()!!.toDouble()

    val maior: Double
    val meio: Double
    val menor: Double
 

    if (num1 >= num2 && num1 >= num3){
        maior = num1
        if(num2 >= num3){
            meio = num2
            menor = num3
        } else{
            meio = num3
            menor = num2
        }
    } else if (num2 >= num1 && num2 >= num3){
        maior = num2
        if (num1 >= num3){
            meio = num1
            menor = num3
        } else{
            meio = num3
            menor = num1
        }
    } else{
        num3 = maior
        if(num2 >= num1){
            meio = num2
            menor = num1
        } else{
            meio = num1
            menor = num2
        }
    }
    println("Os números reais em ordem crescente são: $menor <= $meio <= $maior")
}