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

private fun sentenciaWhen() {
    val pais = "España"
    val edad = 10

    // como un switch
    when (pais) {
        "España", "Mexico", "Argentina" -> {
            println("Se habla español")
        }

        "Italia" -> {
            println("Se habla italiano")
        }

        else -> {
            println("Cuando no es ninguno de los valores")
        }
    }

    when(edad){
        1, 2, 3 -> {
            println("Eres un bebé")
        }
        in 3..10 -> {
            println("Eres un niño")
        }
        in 11..99 -> {
            println("A trabajar como una perra")
        }
        else -> {
            println("El puto amo")
        }
    }
}

private fun arrays(){

    val nombre = "Pepe"
    val apellido = "Pepito"
    val edad = "Pepinillo"

    val miArray: ArrayList<String> = arrayListOf<String>()
    miArray.add(nombre)
    miArray.add(apellido)
    miArray.add(edad)

    println(miArray)

    miArray.addAll(listOf("Aqui","añadimos","varios valores", "a la vez"))

    println(miArray[2])

    miArray.removeAt(4)

    miArray.forEach {
        println(it)
    }

    // Operaciones

    println(miArray.count())
    miArray.clear()
    miArray.first()
    miArray.last()
    miArray.sort()
}

private fun mapas(){
    // tambien llamados diccionarios

    var miMapa: Map<String,Int> = mapOf()
    miMapa = mutableMapOf("Pepe" to 1, "Vane" to 2, "Efren" to 3)

    // si volvemos a asignar el mapOf a la variable se borra to do lo anterior
    // para poder añadir un valor el mapa tiene que ser mutable, para ello usamos mutableMapOf

    miMapa["Ana"] = 7
    miMapa.put("Maria", 8)

    miMapa.put("Pepe", 10)
    miMapa["Pepe"] = 12// cambia el valor asignado a Pepe

    // Como acceder a los valores en los diccionarios
    println(miMapa["Pepe"])

    miMapa.remove("Pepe")
}


























