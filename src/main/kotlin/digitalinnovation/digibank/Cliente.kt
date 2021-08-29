package digitalinnovation.digibank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa( nome, cpf), Login{

    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: ${nome}
        CPF: ${cpf}
        Tipo Cliente: ${clienteTipo.descricao}
    """.trimIndent()
}