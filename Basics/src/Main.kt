import java.util.*

fun main(){

    ejercicio1("Efren", 30)

    ejercicio2(descuento = 0.3, precio = 100)

}

fun ejercicio1(nombre: String?, edad: Int){
    var nombre: String? = nombre
    val edad: Int = edad

    println("Hola ${nombre?: "Usuario desconocido"} tienes $edad años.")
}

fun ejercicio2(precio: Int, descuento: Double = 0.1, aplicarIva: Boolean = true): Double{

    var precioFinal = precio - (precio*descuento)

    if(aplicarIva){
        precioFinal *= 1.21
    }

    return precioFinal
}