class Pessoa(nome: String = "", idade: Int = 0) {
    private val _nome: String = nome
    private val _idade: Int = idade

    init {
        if (idade < 0)
            println("Valor inválido para idade: $idade")
        }    
    }
}