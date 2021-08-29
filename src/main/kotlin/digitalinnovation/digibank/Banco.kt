package digitalinnovation.digibank

data class Banco(
    val nome: String,
    val numero: String,
){
    fun info() = "Nome: $nome, Número: $numero "
}
