package digitalinnovation.digibank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun calculaAuxilio(): Double

    override fun toString(): String = """
        Nome: ${nome}
        CPF: ${cpf}
        Salário: ${salario}
        Auxilio: ${calculaAuxilio()}
    """.trimIndent()

}