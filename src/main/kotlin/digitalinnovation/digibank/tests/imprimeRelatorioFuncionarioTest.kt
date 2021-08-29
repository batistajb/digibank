package digitalinnovation.digibank.tests

import digitalinnovation.digibank.Funcionario

class imprimeRelatorioFuncionarioTest() {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}