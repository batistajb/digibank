package digitalinnovation.digibank.tests

import digitalinnovation.digibank.Cliente
import digitalinnovation.digibank.ClienteTipo

fun main() {
    val cliente = Cliente(
        nome = "Cliente 1",
        cpf = "321456987-89",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(cliente)
    AutenticacaoTest().autentica(cliente)
}