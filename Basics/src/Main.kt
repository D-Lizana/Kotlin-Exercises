import java.util.*

fun main(){

    ejercicio1("Efren", 30)

    ejercicio2(descuento = 0.3, precio = 100)

    ejercicio3()

    ejercicio4()

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

fun ejercicio3(){

    var producto = Producto("Martillo",10.99,5)
    var producto2 = Producto(nombre = "Fregona",precio = 5.99, null)

    producto.mostrarInfo()
    producto2.mostrarInfo()
}

fun ejercicio4(){

    var coche = Coche("Nissan")
    var coche2 = Coche("Hyundai")
    var coche3 = Coche("Toyota")
    var moto = Moto("Honda")
    var moto2 = Moto("Kawasaki")

    var vehiculos: List<Vehiculo> = listOf(coche,coche2,coche3, moto,moto2)

    for(v in vehiculos){
        v.acelerar()
    }
}