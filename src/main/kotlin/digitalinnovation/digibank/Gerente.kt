package digitalinnovation.digibank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario( nome, cpf, salario), Login {
    override fun calculaAuxilio() = salario * 0.3
    override fun login(): Boolean = "senha123" == senha
}