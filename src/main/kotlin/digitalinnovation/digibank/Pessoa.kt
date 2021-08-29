package digitalinnovation.digibank

class Pessoa {
    var nome: String = "Joao"
    var cpf: String = "123.456.789-89"
    private set
}

fun main(){
    val joao = Pessoa()
    println(joao.nome)
    println(joao.cpf)
}