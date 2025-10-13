class Main {





}

private fun variablesYconstantes(){
    // Variables
    var miVariable = "Se puede cambiar"
    println(miVariable)

    // Constantes
    val miConstante = "No se puede cambiar"
    val segundaConstante = miVariable
    println(segundaConstante)
}

private fun tiposDeDatos(){
    // String
    val string: String = "Frase "
    val string2 = " continua"
    val string3 = string+string2
    println(string3)

    // Enteros (Byte,Short,Int,Long)
    val int: Int = 1
    val int2 = 2

    // Decimales (Float, Double)
    val float: Float = 1.5f
    val double = 1.5
    val double2 = 1
    val double3 = double+double2
    println(double3)

    // Boolean
    val bool: Boolean = true
    val bool2 = false
    println(bool==bool2)
}

private fun condicionales(){

    val numero = 10
    println("$numero")

    if(numero < 10){
        println("Algo")
    }
    else{
        println("Nada")
    }
    /*
        = == < > >= <= !=
        && || !
    */
}