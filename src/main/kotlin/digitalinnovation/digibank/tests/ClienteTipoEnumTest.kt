package digitalinnovation.digibank.tests

import digitalinnovation.digibank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elementos ->
        println("${elementos.name} - ${elementos.descricao}" )
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}