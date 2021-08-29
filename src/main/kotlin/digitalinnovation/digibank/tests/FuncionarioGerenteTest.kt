package digitalinnovation.digibank.tests

import digitalinnovation.digibank.Gerente

fun main(){
    val maria = Gerente("Maria","12345678998", 6000.0, "123")

    imprimeRelatorioFuncionarioTest.imprime(maria)

    AutenticacaoTest().autentica(maria)
}

