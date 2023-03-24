fun main(){

    println("Digite as 3 notas do aluno em ordem, considerando os pesos: 2, 3 e 5: ")
    var nota1 = (readLine()!!toFloat())*0.2
    var nota2 = (readLine()!!toFloat())*0.3
    var nota3 = (readLine()!!toFloat())*0.5

    /*/
    var total:Float = (nota1 + nota2 + nota3)       // As 3 variaveis que serão somadas já são Float
    */

    var total = (nota1 + nota2 + nota3)

    if (total >= 7){
        println("Aprovado!")
    } else{
        if (total < 7 && total >= 4){
            println("Final!")
        } else{
            println("Reprovado!")
        }
    }
}