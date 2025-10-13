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

private fun bucles(){
    val miArray = listOf<String>("hola","adios","suscribete")
    val miMapa = mapOf("Diego" to "Crack", "Vane" to "Chata", "Efren" to "Bro")

    // For
    for(cosa: String in miArray){
        println(cosa)
    }
    for(elemento in miMapa){
        println("${elemento.key}: ${elemento.value}")
    }

    for(x in 1..10){
        println(x)
    }

    for(x in 10 until 30){
        println(x)
    }

    for(x in 0..10 step 2){
        println(x)
    }

    for(x in 10 downTo 0 step 3){
        println(x)
    }

    val arrayNumeros = (0..20)
    for(numero in arrayNumeros){
        println(numero)
    }

    // While
    var x = 0
    while(x<10){
        println(x)
        x++
    }
}

private fun excepciones(){

    var string = "dev"
    // string = null da un error de compilacion
    println(string)

    var nullSafety: String? = "Va a tomar valor nulo"
    nullSafety = null
    println(nullSafety)
    println(string!!) // las dos exclamaciones significan que esta comprobando que no es null

    if (string != null){
        println(string)
    }

    println(string!!.length) // comprobamos que no es null antes de buscar length para que no de errores
    println(nullSafety?.length) // en este caso comprueba si es null, si lo es entonces no la ejecuta

    nullSafety?.let { // aqui fuerza a que se lea pero solo si no es null
        println(it)
    } ?: run{
        println(string)
    } // si es null entonces corre esta otra linea de codigo sin usar if else
}


























