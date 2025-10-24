fun main(){

    ejercicio1("Efren", 30)



}

fun ejercicio1(nombre: String?, edad: Int){
    var nombre: String? = nombre
    val edad: Int = edad

    println("Hola ${nombre?: "Usuario desconocido"} tienes $edad años.")
}