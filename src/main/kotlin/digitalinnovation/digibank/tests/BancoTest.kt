package digitalinnovation.digibank.tests

import digitalinnovation.digibank.Banco

fun main(){
    val digiBank = Banco(numero="123",nome="DigiBank")
    val digiBankCopy = digiBank.copy(numero="987",nome="DigiBank Copia")
    println(digiBank.nome)
    println(digiBank.numero)
    println(digiBankCopy.info())
}